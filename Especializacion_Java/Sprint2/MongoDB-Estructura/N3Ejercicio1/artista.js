
db.createCollection( 'artista', {validator: {$jsonSchema: {bsonType: 'object',title:'artista',required: [         'nombre',          'imagen_artista'],properties: {nombre: {bsonType: 'string'},imagen_artista: {bsonType: 'string'}}         }      },
autoIndexId:true
});  