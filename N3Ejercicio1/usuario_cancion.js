
db.createCollection( 'usuario_cancion', {validator: {$jsonSchema: {bsonType: 'object',title:'usuario_cancion',required: [         'usuario_id',          'cancion_id'],properties: {usuario_id: {bsonType: 'int'},cancion_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  