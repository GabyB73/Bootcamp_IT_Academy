db.restaurants.find()
db.restaurants.find({}, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 })
db.restaurants.find({}, { _id: 0, restaurant_id: 1, name: 1, borough: 1, cuisine: 1 })
db.restaurants.find({}, { _id: 0, restaurant_id: 1, name: 1, borough: 1, "address.zipcode": 1})
db.restaurants.find({}, {"borough": "Bronx"})
db.restaurants.find({}, { "borough": "Bronx" }).limit(5)
db.restaurants.find({}, { "borough": "Bronx" }).skip(5).limit(5)
db.restaurants.find({ "grades.score": { $gt: 90 } })
db.restaurants.find({ "grades.score": { $gt: 80, $lt: 100 } })
db.restaurants.find({ "address.coord": { $lt: -95.754168 } })
db.restaurants.find({$and: [{ "cuisine": { $ne: "American" } },{ "grades.score": { $gt: 70 } },{ "address.coord": { $lt: -65.754168 } } ] })
db.restaurants.find({ "cuisine": { $ne: "American" }, "grades.score": { $gt: 70 }, "address.coord": { $lt: -65.754168 } })
db.restaurants.find({ "cuisine": { $ne: "American" }, "grades.grade": "A", "borough": { $ne: "Brooklyn" }}).sort({ "cuisine": -1 })
db.restaurants.find({ "name": { $regex: /^Wil/i } }, { "restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 } )
db.restaurants.find({ "name": { $regex: /ces$/, $options: 'i' } }, { "restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ "name": { $regex: /reg/i } }, { "restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ "borough": "Bronx", "cuisine": { $in: ["American", "Chinese"]}})
db.restaurants.find({borough: { $in: ["Staten Island", "Queens", "Bronx", "Brooklyn"]}, "restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ "borough": { $nin: ["Staten Island", "Queens", "Bronx", "Brooklyn"]}}, {"restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ "grades.score": { $not: { $gt: 10 } } }, { "restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ $or: [{ "cuisine": { $nin: ["American", "Chinese"] } }, { "name": { $regex: /^Wil/ }}]}, {"restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.restaurants.find({ "grades": { $elemMatch: { "grade": "A", "score": 11, "date": ISODate("2014-08-11T00:00:00Z")}}}, { "restaurant_id": 1, "name": 1, "grades": 1})
db.restaurants.find({ "grades.1.grade": "A", "grades.1.score": 9, "grades.1.date": ISODate("2014-08-11T00:00:00Z")}, { "restaurant_id": 1, "name": 1, "grades": 1 })
db.restaurants.find({ "coord.1": { $gt: 42, $lte: 52 }}, { "restaurant_id": 1, "name": 1, "address": 1, "coord": 1 })
db.restaurants.find().sort({ "name": 1 })
db.restaurants.find().sort({ "name": -1 })
db.restaurants.find().sort({ "cuisine": 1, "borough": -1 })
db.restaurants.find({ "address.street": { $exists: false } })
db.restaurants.find({ "coord": { $type: "double" } })
db.restaurants.find({ "grades.score": { $mod: [7, 0] }}, { "restaurant_id": 1, "name": 1, "grades": 1 })
db.restaurants.find({ "name": { $regex: /mon/i } }, { "name": 1, "borough": 1, "coord": 1, "cuisine": 1 })
db.restaurants.find({"name": { $regex: /^Mad/i } }, { "name": 1, "borough": 1, "coord": 1, "cuisine": 1 })










/*17- // db.restaurants.find({"borough": "Bronx", "$or": [{ "cuisine": "American" }, { "cuisine": "Chinese" }]})*/