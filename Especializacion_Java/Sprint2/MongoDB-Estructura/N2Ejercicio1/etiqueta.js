
db.createCollection( 'etiqueta', {validator: {$jsonSchema: {bsonType: 'object',title:'etiqueta',properties: {nombre: {bsonType: 'string'}}         }      },
autoIndexId:true
});  