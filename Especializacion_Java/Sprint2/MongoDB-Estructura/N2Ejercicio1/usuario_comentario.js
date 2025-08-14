
db.createCollection( 'usuario_comentario', {validator: {$jsonSchema: {bsonType: 'object',title:'usuario_comentario',required: [         'usuario_id',          'comentario_id'],properties: {usuario_id: {bsonType: 'int'},comentario_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  