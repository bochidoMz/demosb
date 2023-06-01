package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Pais;

public interface CasaRepository extends JpaRepository<Pais, Long>{

}
