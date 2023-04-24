package pas.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	private String num_referencia;

	private String contenido;

	private int valor;

	@ManyToOne()
	@JoinColumn(name = "almacen")
	private Almacen almacen;
	
	public Caja() {
		
	}

	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public String getNum_referencia() {
		return num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public int getValor() {
		return valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

}
