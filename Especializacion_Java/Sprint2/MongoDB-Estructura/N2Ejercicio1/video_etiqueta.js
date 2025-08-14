
db.createCollection( 'video_etiqueta', {validator: {$jsonSchema: {bsonType: 'object',title:'video_etiqueta',properties: {video_id: {bsonType: 'int'},etiqueta_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  