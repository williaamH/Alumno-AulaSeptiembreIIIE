package idatcom.SeptiembreAulaIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idatcom.SeptiembreAulaIIIE.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer>{

}
