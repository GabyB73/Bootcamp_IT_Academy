
db.createCollection( 'likes_dislikes', {validator: {$jsonSchema: {bsonType: 'object',title:'likes_dislikes',required: [         'usuario_id',          'video_id',          'comentario_id',          'tipo',          'fecha_hora'],properties: {usuario_id: {bsonType: 'int'},video_id: {bsonType: 'int'},comentario_id: {bsonType: 'int'},tipo: {enum: ["Like", "Dislike"]},fecha_hora: {bsonType: 'date'}}         }      },
autoIndexId:true
});  