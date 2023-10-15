
db.createCollection( 'tienda', {validator: {$jsonSchema: {bsonType: 'object',title:'tienda',required: [         'direccion',          'codigo_postal',          'idLocalidad'],properties: {direccion: {bsonType: 'string'},codigo_postal: {bsonType: 'string'},idLocalidad: {bsonType: 'int'}}         }      },
autoIndexId:true
});  