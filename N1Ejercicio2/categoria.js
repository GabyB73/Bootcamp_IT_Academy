
db.createCollection( 'categoria', {validator: {$jsonSchema: {bsonType: 'object',title:'categoria',required: [         'nombre'],properties: {nombre: {bsonType: 'string'}}         }      },
autoIndexId:true
});  