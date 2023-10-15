
db.createCollection( 'suscripcion', {validator: {$jsonSchema: {bsonType: 'object',title:'suscripcion',required: [         'fecha_inicio',          'fecha_renovacion',          'forma_pago',          'usuario_id'],properties: {fecha_inicio: {bsonType: 'date'},fecha_renovacion: {bsonType: 'date'},forma_pago: {enum: ["Tarjeta", "PayPal"]},usuario_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  