
db.createCollection( 'provincia', {validator: {$jsonSchema: {bsonType: 'object',title:'provincia',required: [         'nombre'],properties: {nombre: {bsonType: 'string'}}         }      },
autoIndexId:true
});  