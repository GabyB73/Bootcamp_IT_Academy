
db.createCollection( 'suscripcion_canal', {validator: {$jsonSchema: {bsonType: 'object',title:'suscripcion_canal',required: [         'fecha_hora',          'usuario_id',          'canal_id'],properties: {fecha_hora: {bsonType: 'date'},usuario_id: {bsonType: 'int'},canal_id: {bsonType: 'int'}}         }      },
autoIndexId:true
});  