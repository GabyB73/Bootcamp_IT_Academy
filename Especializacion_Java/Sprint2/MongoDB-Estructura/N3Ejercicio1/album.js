
db.createCollection( 'album', {validator: {$jsonSchema: {bsonType: 'object',title:'album',required: [         'titulo',          'año_publicacion',          'imagen_portada',          'artista_id'],properties: {titulo: {bsonType: 'string'},año_publicacion: {bsonType: 'date'},imagen_portada: {bsonType: 'string'},artista_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  