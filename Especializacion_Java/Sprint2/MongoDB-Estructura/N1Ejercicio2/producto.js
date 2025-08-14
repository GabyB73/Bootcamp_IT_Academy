
db.createCollection( 'producto', {validator: {$jsonSchema: {bsonType: 'object',title:'producto',required: [         'nombre',          'descripcion',          'imagen',          'precio',          'idCategoria'],properties: {nombre: {bsonType: 'string'},descripcion: {bsonType: 'string'},imagen: {bsonType: 'string'},precio: {bsonType: 'double'},idCategoria: {bsonType: 'int'}}         }      },
autoIndexId:true
});  