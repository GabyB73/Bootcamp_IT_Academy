
db.createCollection( 'usuario_album', {validator: {$jsonSchema: {bsonType: 'object',title:'usuario_album',required: [         'usuario_id',          'album_id'],properties: {usuario_id: {bsonType: 'int'},album_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  