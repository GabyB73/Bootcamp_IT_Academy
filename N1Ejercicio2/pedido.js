
db.createCollection( 'pedido', {validator: {$jsonSchema: {bsonType: 'object',title:'pedido',required: [         'fecha_hora',          'recogida',          'cantidad_pizza',          'cantidad_hamburguesa',          'cantidad_bebida',          'precio',          'idCliente',          'idEmpleado'],properties: {fecha_hora: {bsonType: 'date'},recogida: {enum: ["tienda", "domicilio"]
},cantidad_pizza: {bsonType: 'int'},cantidad_hamburguesa: {bsonType: 'int'},cantidad_bebida: {bsonType: 'int'},precio: {bsonType: 'double'},idCliente: {bsonType: 'int'},idEmpleado: {bsonType: 'int'}}         }      },
autoIndexId:true
});  