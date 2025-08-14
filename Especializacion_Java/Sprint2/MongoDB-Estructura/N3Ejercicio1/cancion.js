
db.createCollection( 'cancion', {validator: {$jsonSchema: {bsonType: 'object',title:'cancion',required: [         'titulo',          'duracion',          'num_reproducciones',          'album_id',          'cancion_id'],properties: {titulo: {bsonType: 'string'},duracion: {bsonType: 'int'},num_reproducciones: {bsonType: 'int'},album_id: {bsonType: 'int'},cancion_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  