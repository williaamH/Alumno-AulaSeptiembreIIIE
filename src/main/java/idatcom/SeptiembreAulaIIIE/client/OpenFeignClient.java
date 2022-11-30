package idatcom.SeptiembreAulaIIIE.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import idatcom.SeptiembreAulaIIIE.dto.AlumnoDTO;

@FeignClient(name = "alumno-microservicio", url = "localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/alumno/v1/listar")
	public List<AlumnoDTO> listarAlumnos();

}
