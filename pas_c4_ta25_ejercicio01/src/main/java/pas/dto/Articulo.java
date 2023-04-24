/**
 * 
 */
package pas.dto;

import jakarta.persistence.Column;
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
@Table(name = "articulos")
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private int precio;

	@ManyToOne()
	@JoinColumn(name = "codigo_fabricante")
	private Fabricante codigo_fabricante;

	// Constructors
	public Articulo() {
	}

	public Articulo(Long id, String nombre, int precio, Fabricante codigo_fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.codigo_fabricante = codigo_fabricante;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public Fabricante getFabricante() {
		return codigo_fabricante;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setFabricante(Fabricante codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
	}
}
