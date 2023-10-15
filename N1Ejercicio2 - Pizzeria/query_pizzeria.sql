-- Lista cuántos productos de categoría 'Bebidas' se han vendido en una determinada localidad.

  
SELECT SUM(pedido.Cantidad_bebida) AS Total_Bebidas_Vendidas
FROM pedido
INNER JOIN tienda ON pedido.IdTienda = tienda.IdTienda
WHERE tienda.IdLocalidad = '1';


-- Lista cuántos pedidos ha efectuado un determinado empleado/a.
SELECT COUNT(IdPedido) AS Total_Pedidos
FROM pedido
WHERE IdEmpleado = 10;






