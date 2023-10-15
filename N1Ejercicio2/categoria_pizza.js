
db.createCollection( 'categoria_pizza', {validator: {$jsonSchema: {bsonType: 'object',title:'categoria_pizza',properties: {idCategoria: {bsonType: 'int'}}         }      },
autoIndexId:true
});  