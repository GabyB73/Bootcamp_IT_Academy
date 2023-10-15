
db.createCollection( 'cancion_playlist', {validator: {$jsonSchema: {bsonType: 'object',title:'cancion_playlist',required: [         'cancion_id',          'playlist_id'],properties: {cancion_id: {bsonType: 'int'},playlist_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  