
db.createCollection( 'pedido_producto', {validator: {$jsonSchema: {bsonType: 'object',title:'pedido_producto',required: [         'idPedido',          'idProducto',          'cantidad',          'precio'],properties: {idPedido: {bsonType: 'int'},idProducto: {bsonType: 'int'},cantidad: {bsonType: 'int'},precio: {bsonType: 'double'},idPedido: {bsonType: 'int'},idProducto: {bsonType: 'int'}}         }      },
autoIndexId:true
});  