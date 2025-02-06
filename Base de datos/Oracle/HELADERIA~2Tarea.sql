/*Consulta.1*/
Select p.nombre, sum(d.cantidad) "Nº de unidades pedidas"
from productos p join detalles_pedido d on p.id = d.id_producto
GROUP by p.nombre,d.id_producto
order by 2,1;

/*Consulta.2*/
SELECT DISTINCT c.nombre,c.dirección, c.cp, c.teléfono
from clientes c 
JOIN pedidos p on c.id =p.id_cliente
where p.fecha_pedido BETWEEN '01-02-2025' AND '28-02-2025';

/*Consulta.3*/
SELECT c.nombre, p.nombre
from clientes c 
join detalles_pedido d join productos p on c.id = d.id_pedido /*AND d.id_producto = p.id*/