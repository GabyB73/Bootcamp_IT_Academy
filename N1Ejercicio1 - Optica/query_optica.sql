USE optica;

-- Lista el total de facturas de un cliente/a en un período determinado.
SELECT C.Nombre AS Cliente, COUNT(*) AS TotalFacturas
FROM optica.Cliente C
INNER JOIN optica.Venta V ON C.IdCliente = V.Cliente_IdCliente
WHERE C.IdCliente = 2
  AND V.Fecha_venta BETWEEN '2023-01-01' AND '2023-12-31'
GROUP BY C.Nombre;
  
-- Lista los diferentes modelos de gafas que ha vendido un empleado durante un año.

SELECT V.Nombre_vendedor AS Empleado, G.Marca AS Modelo
FROM optica.Venta V
INNER JOIN optica.Gafa G ON V.Gafa_IdGafa = G.IdGafa
WHERE YEAR(V.Fecha_venta) = 2023
ORDER BY Empleado, Modelo;

-- Lista a los diferentes proveedores que han suministrado gafas vendidas con éxito por la óptica

  SELECT DISTINCT P.Nombre AS Proveedor
FROM optica.Proveedor P
INNER JOIN optica.Gafa G ON P.IdProveedor = G.Proveedor_IdProveedor
INNER JOIN optica.Venta V ON G.IdGafa = V.Gafa_IdGafa
ORDER BY Proveedor;
  
  