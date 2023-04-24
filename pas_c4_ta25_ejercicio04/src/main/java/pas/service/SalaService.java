/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pas.dao.SalaDAO;
import pas.dto.Sala;


/**
 * @author paul_
 *
 */

@Service
public class SalaService implements SalaServiceInterface {

	SalaDAO salaDAO;

	@Override
	public List<Sala> listarSalas() {
		return salaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return salaDAO.save(sala);
	}

	@Override
	public Sala salaXID(Long id) {
		return salaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return salaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		salaDAO.deleteById(id);
	}
	
}
