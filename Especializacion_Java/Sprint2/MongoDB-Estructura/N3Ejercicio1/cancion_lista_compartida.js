
db.createCollection( 'cancion_lista_compartida', {validator: {$jsonSchema: {bsonType: 'object',title:'cancion_lista_compartida',required: [         'cancion_id',          'lista_compartida_id'],properties: {cancion_id: {bsonType: 'int'},lista_compartida_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  