
db.createCollection( 'localidad', {validator: {$jsonSchema: {bsonType: 'object',title:'localidad',required: [         'nombre',          'idProvincia'],properties: {nombre: {bsonType: 'string'},idProvincia: {bsonType: 'int'}}         }      },
autoIndexId:true
});  