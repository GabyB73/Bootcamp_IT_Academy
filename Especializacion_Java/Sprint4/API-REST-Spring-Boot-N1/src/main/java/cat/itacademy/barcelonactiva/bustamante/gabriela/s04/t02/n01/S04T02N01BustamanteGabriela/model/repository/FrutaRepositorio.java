package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.model.repository;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.model.domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepositorio extends JpaRepository<Fruta, Integer> {

}
