package idatcom.SeptiembreAulaIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idatcom.SeptiembreAulaIIIE.client.OpenFeignClient;
import idatcom.SeptiembreAulaIIIE.dto.AlumnoDTO;
import idatcom.SeptiembreAulaIIIE.model.AlumnoAulaFK;
import idatcom.SeptiembreAulaIIIE.model.Aula;
import idatcom.SeptiembreAulaIIIE.model.AulaDetalle;
import idatcom.SeptiembreAulaIIIE.repository.AulaRepository;
import idatcom.SeptiembreAulaIIIE.repository.DetalleAulaRepository;

@Service
public class AulaServiceImpl implements AulaService {
	
	@Autowired
	private AulaRepository aluRepo;
	
	@Autowired
	private DetalleAulaRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;

	@Override
	public void guardarAula(Aula aula) {
		aluRepo.save(aula);

	}

	@Override
	public void asignarAulumnoAula() {
		
		List<AlumnoDTO> listado = client.listarAlumnos();
		AlumnoAulaFK fk = null;
		AulaDetalle detalle = null;
		
		for (AlumnoDTO alumnoDTO : listado) {
			fk = new AlumnoAulaFK();
			fk.setIdAlumno(alumnoDTO.getCod());
			fk.setIdAula(1);
			
			detalle = new AulaDetalle();
			detalle.setFk(fk);
			
			detalleRepo.save(detalle);
		}
		
	}

}
