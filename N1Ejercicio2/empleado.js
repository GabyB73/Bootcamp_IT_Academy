
db.createCollection( 'empleado', {validator: {$jsonSchema: {bsonType: 'object',title:'empleado',required: [         'nombre',          'apellido',          'nif',          'puesto_trabajo',          'idTienda',          'idEmpleado'],properties: {nombre: {bsonType: 'string'},apellido: {bsonType: 'string'},nif: {bsonType: 'string'},puesto_trabajo: {enum: ["cocinero", "repartidor"]
},idTienda: {bsonType: 'int'},idEmpleado: {bsonType: 'int'}}         }      },
autoIndexId:true
});  