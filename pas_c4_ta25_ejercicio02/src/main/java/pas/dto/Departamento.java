package pas.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "departamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "presupuesto")
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "departamento")
	private List<Empleado> empleado;

	public Departamento() {
	}

	public Departamento(Long id, String nombre, int presupuesto) {
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
}
