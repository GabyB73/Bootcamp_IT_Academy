
db.createCollection( 'playlist', {validator: {$jsonSchema: {bsonType: 'object',title:'playlist',required: [         'titulo',          'num_canciones',          'fecha_creacion',          'estado',          'usuario_id',          'fecha_eliminacion'],properties: {titulo: {bsonType: 'string'},num_canciones: {bsonType: 'int'},fecha_creacion: {bsonType: 'date'},estado: {enum: ["Activas", "Borradas"]},usuario_id: {bsonType: 'int'},fecha_eliminacion: {bsonType: 'date'}}         }      },
autoIndexId:true
});  