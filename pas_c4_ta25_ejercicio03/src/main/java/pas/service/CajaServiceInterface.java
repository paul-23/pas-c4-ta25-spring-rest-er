/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Caja;

/**
 * @author paul_
 *
 */

public interface CajaServiceInterface {

	public List<Caja> listarCajas();

	public Caja guardarCaja(Caja caja);

	public Caja cajaXID(String num_referencia);

	public Caja actualizarCaja(Caja caja);

	public void eliminarCaja(String num_referencia);

}
