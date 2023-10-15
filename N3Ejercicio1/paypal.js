
db.createCollection( 'paypal', {validator: {$jsonSchema: {bsonType: 'object',title:'paypal',required: [         'nombre_usuario_paypal',          'usuario_id'],properties: {nombre_usuario_paypal: {bsonType: 'string'},usuario_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  