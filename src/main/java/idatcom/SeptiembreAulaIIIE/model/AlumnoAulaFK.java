package idatcom.SeptiembreAulaIIIE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AlumnoAulaFK implements Serializable{

	private static final long serialVersionUID = -7831879737668425927L;

	@Column(name = "id_aula", nullable = false)
	private Integer idAula;
	
	@Column(name = "id_alumno", nullable = false)
	private Integer idAlumno;

	public Integer getIdAula() {
		return idAula;
	}

	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

}
