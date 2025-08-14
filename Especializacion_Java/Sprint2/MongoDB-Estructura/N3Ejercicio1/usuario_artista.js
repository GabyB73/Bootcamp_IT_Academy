
db.createCollection( 'usuario_artista', {validator: {$jsonSchema: {bsonType: 'object',title:'usuario_artista',required: [         'usuario_id',          'artista_id'],properties: {usuario_id: {bsonType: 'int'},artista_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  