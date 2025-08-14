
db.createCollection( 'lista_compartida', {validator: {$jsonSchema: {bsonType: 'object',title:'lista_compartida',required: [         'nombre_usuario',          'fecha',          'usuario_id'],properties: {nombre_usuario: {bsonType: 'string'},fecha: {bsonType: 'date'},usuario_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  