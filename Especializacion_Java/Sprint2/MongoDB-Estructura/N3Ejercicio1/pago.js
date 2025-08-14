
db.createCollection( 'pago', {validator: {$jsonSchema: {bsonType: 'object',title:'pago',required: [         'fecha_pago',          'num_orden',          'total',          'usuario_id',          'suscripcion_id'],properties: {fecha_pago: {bsonType: 'date'},num_orden: {bsonType: 'string'},total: {bsonType: 'double'},usuario_id: {bsonType: 'int'},suscripcion_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  