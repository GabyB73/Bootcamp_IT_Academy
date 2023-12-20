package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.repository;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n03.S04T02N03BustamanteGabriela.model.domain.Fruta;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepositorio extends MongoRepository <Fruta, ObjectId>{
}
