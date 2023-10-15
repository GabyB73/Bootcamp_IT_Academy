
db.createCollection( 'playlist', {validator: {$jsonSchema: {bsonType: 'object',title:'playlist',required: [         'nombre',          'fecha_creacion',          'estado'],properties: {nombre: {bsonType: 'string'},fecha_creacion: {bsonType: 'date'},estado: {enum: ["Publico", "Privado"]}}         }      },
autoIndexId:true
});  