
db.createCollection( 'Proveedor', {validator: {$jsonSchema: {bsonType: 'object',title:'Proveedor',required: [         'nombre',          'direccion',          'telefono',          'fax',          'nif',          'Gafa_id'],properties: {nombre: {bsonType: 'string'},direccion: {bsonType: 'object',
title:'object',properties: {calle: {bsonType: 'string'},numero: {bsonType: 'string'},piso: {bsonType: 'string'},puerta: {bsonType: 'string'},ciudad: {bsonType: 'string'},cod_postal: {bsonType: 'string'},pais: {bsonType: 'string'}}},telefono: {bsonType: 'string'},fax: {bsonType: 'string'},nif: {bsonType: 'string'},Gafa_id: {bsonType: 'object',
title:'object',}}         }      },
autoIndexId:true
});  