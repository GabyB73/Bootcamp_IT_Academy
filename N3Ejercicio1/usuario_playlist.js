
db.createCollection( 'usuario_playlist', {validator: {$jsonSchema: {bsonType: 'object',title:'usuario_playlist',required: [         'usuario_id',          'playlist_id',          'fecha_compartido'],properties: {usuario_id: {bsonType: 'int'},playlist_id: {bsonType: 'int'},fecha_compartido: {bsonType: 'date'}}         }      },
autoIndexId:true
});  