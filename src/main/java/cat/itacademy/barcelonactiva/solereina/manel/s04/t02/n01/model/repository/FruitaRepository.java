package cat.itacademy.barcelonactiva.solereina.manel.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.solereina.manel.s04.t02.n01.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
}
