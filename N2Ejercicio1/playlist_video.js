
db.createCollection( 'playlist_video', {validator: {$jsonSchema: {bsonType: 'object',title:'playlist_video',required: [         'playlist_id',          'video_id'],properties: {playlist_id: {bsonType: 'int'},video_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  