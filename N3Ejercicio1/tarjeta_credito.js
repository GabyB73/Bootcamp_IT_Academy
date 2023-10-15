
db.createCollection( 'tarjeta_credito', {validator: {$jsonSchema: {bsonType: 'object',title:'tarjeta_credito',required: [         'numero_tarjeta',          'fecha_caducidad',          'codigo_seguridad',          'usuario_id'],properties: {numero_tarjeta: {bsonType: 'string'},fecha_caducidad: {bsonType: 'date'},codigo_seguridad: {bsonType: 'string'},usuario_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  