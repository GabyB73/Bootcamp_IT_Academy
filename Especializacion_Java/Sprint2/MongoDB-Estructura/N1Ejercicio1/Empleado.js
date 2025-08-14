
db.createCollection( 'Empleado', {validator: {$jsonSchema: {bsonType: 'object',title:'Empleado',required: [         'nombre',          'Cliente_id'],properties: {nombre: {bsonType: 'string'},Cliente_id: {bsonType: 'objectId'}}         }      },
autoIndexId:true
});  