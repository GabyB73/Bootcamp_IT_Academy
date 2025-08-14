
db.createCollection( 'cliente', {validator: {$jsonSchema: {bsonType: 'object',title:'cliente',required: [         'nombre',          'apellido',          'direcciion',          'telefono'],properties: {nombre: {bsonType: 'string'},apellido: {bsonType: 'string'},direcciion: {bsonType: 'string'},telefono: {bsonType: 'string'},idLocalidad: {bsonType: 'int'}}         }      },
autoIndexId:true
});  