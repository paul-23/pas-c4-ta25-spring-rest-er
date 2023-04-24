/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.CajaDAO;
import pas.dto.Caja;

/**
 * @author paul_
 *
 */

@Service
public class CajaService implements CajaServiceInterface {

	@Autowired
	CajaDAO cajaDAO;

	@Override
	public List<Caja> listarCajas() {
		return cajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String num_referencia) {
		return cajaDAO.findById(num_referencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String num_referencia) {
		cajaDAO.deleteById(num_referencia);
	}

	

}
