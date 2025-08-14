-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pizzeria` DEFAULT CHARACTER SET utf8mb3 ;
USE `pizzeria` ;

-- -----------------------------------------------------
-- Table `pizzeria`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`categoria` (
  `IdCategoria` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdCategoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`categoria_pizza`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`categoria_pizza` (
  `IdCategoria_Pizza` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdCategoria_Pizza`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`cliente` (
  `IdCliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdCliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`provincia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`provincia` (
  `IdProvincia` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdProvincia`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`localidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`localidad` (
  `IdLocalidad` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `IdProvincia` INT NOT NULL,
  PRIMARY KEY (`IdLocalidad`),
  INDEX `Provincia_IdProvincia_idx` (`IdProvincia` ASC) VISIBLE,
  CONSTRAINT `Provincia_IdProvincia`
    FOREIGN KEY (`IdProvincia`)
    REFERENCES `pizzeria`.`provincia` (`IdProvincia`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`tienda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`tienda` (
  `IdTienda` INT NOT NULL AUTO_INCREMENT,
  `Direccion` VARCHAR(45) NOT NULL,
  `Codigo_postal` VARCHAR(45) NOT NULL,
  `IdLocalidad` INT NOT NULL,
  PRIMARY KEY (`IdTienda`),
  INDEX `FK_Localidad_IdLocalidad` (`IdLocalidad` ASC) VISIBLE,
  CONSTRAINT `FK_Localidad_IdLocalidad`
    FOREIGN KEY (`IdLocalidad`)
    REFERENCES `pizzeria`.`localidad` (`IdLocalidad`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`empleado` (
  `IdEmpleado` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `NIF` VARCHAR(45) NOT NULL,
  `Puesto_trabajo` ENUM('Cocinero', 'Repartidor') NOT NULL,
  `IdTienda` INT NOT NULL,
  PRIMARY KEY (`IdEmpleado`),
  INDEX `Tienda_IdTienda_idx` (`IdTienda` ASC) VISIBLE,
  CONSTRAINT `Tienda_IdTienda`
    FOREIGN KEY (`IdTienda`)
    REFERENCES `pizzeria`.`tienda` (`IdTienda`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`pedido` (
  `IdPedido` INT NOT NULL AUTO_INCREMENT,
  `Fecha_hora` DATETIME NOT NULL,
  `Recogida` ENUM('tienda', 'domicilio') NOT NULL,
  `Cantidad_pizza` INT NOT NULL,
  `Cantidad_hamburguesa` INT NOT NULL,
  `Cantidad_bebida` INT NOT NULL,
  `Precio` FLOAT NOT NULL,
  `IdCliente` INT NOT NULL,
  `IdEmpleado` INT NOT NULL,
  `IdTienda` INT NOT NULL,
  `IdLocalidad` INT NULL DEFAULT NULL,
  PRIMARY KEY (`IdPedido`),
  INDEX `Empleado_IdEmpleado_idx` (`IdEmpleado` ASC) VISIBLE,
  INDEX `Tienda_IdTienda_idx` (`IdTienda` ASC) VISIBLE,
  INDEX `Cliente_IdCliente_idx` (`IdCliente` ASC) VISIBLE,
  INDEX `Pedido_Localidad_IdLocalidad_idx` (`IdLocalidad` ASC) VISIBLE,
  CONSTRAINT `Cliente_IdCliente`
    FOREIGN KEY (`IdCliente`)
    REFERENCES `pizzeria`.`cliente` (`IdCliente`),
  CONSTRAINT `Empleado_IdEmpleado_Pedido`
    FOREIGN KEY (`IdEmpleado`)
    REFERENCES `pizzeria`.`empleado` (`IdEmpleado`),
  CONSTRAINT `Pedido_Localidad_IdLocalidad`
    FOREIGN KEY (`IdLocalidad`)
    REFERENCES `pizzeria`.`localidad` (`IdLocalidad`),
  CONSTRAINT `Pedido_Tienda_IdTienda`
    FOREIGN KEY (`IdTienda`)
    REFERENCES `pizzeria`.`tienda` (`IdTienda`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`producto` (
  `IdProducto` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(200) NOT NULL,
  `Imagen` VARCHAR(200) NOT NULL,
  `Precio` FLOAT NOT NULL,
  `Categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdProducto`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `pizzeria`.`pedido_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`pedido_producto` (
  `IdPedido_Producto` INT NOT NULL AUTO_INCREMENT,
  `IdPedido` INT NOT NULL,
  `IdProducto` INT NOT NULL,
  `Cantidad` INT NOT NULL,
  `Precio` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`IdPedido_Producto`),
  INDEX `IdPedido_idx` (`IdPedido` ASC) VISIBLE,
  INDEX `IdProducto_idx` (`IdProducto` ASC) VISIBLE,
  CONSTRAINT `IdPedido`
    FOREIGN KEY (`IdPedido`)
    REFERENCES `pizzeria`.`pedido` (`IdPedido`),
  CONSTRAINT `IdProducto`
    FOREIGN KEY (`IdProducto`)
    REFERENCES `pizzeria`.`producto` (`IdProducto`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
