
db.createCollection( 'forma_de_pago', {validator: {$jsonSchema: {bsonType: 'object',title:'forma_de_pago',required: [         'numero_tarjeta',          'mes_año_caducidad',          'codigo_seguridad',          'nombre',          'usuario_id',          'suscripcion_id'],properties: {numero_tarjeta: {bsonType: 'string'},mes_año_caducidad: {bsonType: 'date'},codigo_seguridad: {bsonType: 'string'},nombre: {bsonType: 'string'},usuario_id: {bsonType: 'int'},suscripcion_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  