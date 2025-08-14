
db.createCollection( 'canal', {validator: {$jsonSchema: {bsonType: 'object',title:'canal',required: [         'nombre',          'descripcion',          'fecha_creacion'],properties: {nombre: {bsonType: 'string'},descripcion: {bsonType: 'string'},fecha_creacion: {bsonType: 'date'}}         }      },
autoIndexId:true
});  