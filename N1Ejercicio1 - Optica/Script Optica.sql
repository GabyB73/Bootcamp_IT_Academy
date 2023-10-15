-- MySQL Workbench Forward Engineering

-- Configuración de variables

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Optica
-- -----------------------------------------------------
DROP DATABASE IF EXISTS `Optica`;

CREATE SCHEMA IF NOT EXISTS `Optica` DEFAULT CHARACTER SET utf8 ;
USE `Optica` ;

-- -----------------------------------------------------
-- Table `Optica`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Optica`.`Proveedor` (
  `IdProveedor` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(9) NOT NULL,
  `Fax` VARCHAR(9) NOT NULL,
  `NIF` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`IdProveedor`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Optica`.`Gafa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Optica`.`Gafa` (
  `IdGafa` INT NOT NULL AUTO_INCREMENT,
  `Marca` VARCHAR(45) NOT NULL,
  `Graduacion_cristal_derecho` FLOAT NOT NULL,
  `Graduacion_cristal_izquierdo` FLOAT NOT NULL,
  `Tipo_montura` VARCHAR(45) NOT NULL,
  `Color_cristal` VARCHAR(45) NOT NULL,
  `Color_montura` VARCHAR(45) NOT NULL,
  `Precio` FLOAT NOT NULL,
  `Proveedor_IdProveedor` INT NOT NULL,
  PRIMARY KEY (`IdGafa`),
  CONSTRAINT `fk_Gafa_Proveedor`
    FOREIGN KEY (`Proveedor_IdProveedor`)
    REFERENCES `Optica`.`Proveedor` (`IdProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Optica`.`Venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Optica`.`Venta` (
  `IdVenta` INT NOT NULL AUTO_INCREMENT,
  `Fecha_venta` DATE NOT NULL,
  `Nombre_vendedor` VARCHAR(45) NOT NULL,
  `Cliente_IdCliente` INT NOT NULL,
  `Gafa_IdGafa` INT NOT NULL,
  PRIMARY KEY (`IdVenta`),
  INDEX `fk_Venta_Gafa_idx` (`Gafa_IdGafa` ASC),
  INDEX `fk_Venta_Cliente_idx` (`Cliente_IdCliente` ASC),
  CONSTRAINT `fk_Venta_Gafa`
    FOREIGN KEY (`Gafa_IdGafa`)
    REFERENCES `Optica`.`Gafa` (`IdGafa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_Cliente`
    FOREIGN KEY (`Cliente_IdCliente`)
    REFERENCES `Optica`.`Cliente` (`IdCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Optica`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Optica`.`Cliente` (
  `IdCliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Direccion_postal` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(9) NOT NULL,
  `Correo_electronico` VARCHAR(45) NOT NULL,
  `Fecha_registro` DATE NOT NULL,
  `Referido_por` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdCliente`)
) ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;




