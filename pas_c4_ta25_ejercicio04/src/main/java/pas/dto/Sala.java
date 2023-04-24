package pas.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "salas")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@ManyToOne()
	@JoinColumn(name = "pelicula")
	private Pelicula pelicula;

	public Sala() {
	}

	public Sala(Long id, String nombre, Pelicula pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}
