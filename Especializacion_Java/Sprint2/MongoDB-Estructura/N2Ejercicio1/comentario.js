
db.createCollection( 'comentario', {validator: {$jsonSchema: {bsonType: 'object',title:'comentario',required: [         'texto',          'fecha_hora',          'hacer_comentario',          'video_id'],properties: {texto: {bsonType: 'string'},fecha_hora: {bsonType: 'date'},hacer_comentario: {enum: ["Me gusta", "No me gusta"]},video_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  