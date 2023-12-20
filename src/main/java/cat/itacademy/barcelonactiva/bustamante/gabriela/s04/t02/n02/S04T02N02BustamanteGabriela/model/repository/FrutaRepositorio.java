package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.model.repository;

import cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n02.S04T02N02BustamanteGabriela.model.domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepositorio extends JpaRepository<Fruta, Integer> {
}
