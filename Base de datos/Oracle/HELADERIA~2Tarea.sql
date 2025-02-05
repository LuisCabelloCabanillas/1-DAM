Select p.nombre, sum(d.cantidad)
from productos p join detalles_pedido d on p.id = d.id_producto
GROUP by p.nombre,d.id_producto
order by 2,1;