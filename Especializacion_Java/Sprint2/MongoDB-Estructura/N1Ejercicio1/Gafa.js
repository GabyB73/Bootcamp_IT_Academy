
db.createCollection( 'Gafa', {validator: {$jsonSchema: {bsonType: 'object',title:'Gafa',required: [         'marca',          'graduacion',          'tipo_montura',          'color_montura',          'color_cristal',          'precio'],properties: {marca: {bsonType: 'string'},graduacion: {bsonType: 'object',
title:'object',properties: {cristal_izq: {bsonType: 'string'},cristal_der: {bsonType: 'string'}}},tipo_montura: {enum: ["flotante," "pasta," "metálica," ]},color_montura: {bsonType: 'string'},color_cristal: {bsonType: 'string'},precio: {bsonType: 'double'}}         }      },
autoIndexId:true
});  