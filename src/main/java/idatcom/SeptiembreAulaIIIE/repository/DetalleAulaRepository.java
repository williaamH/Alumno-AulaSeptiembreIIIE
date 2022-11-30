package idatcom.SeptiembreAulaIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idatcom.SeptiembreAulaIIIE.model.AulaDetalle;

@Repository
public interface DetalleAulaRepository extends JpaRepository<AulaDetalle, Integer>{

}
