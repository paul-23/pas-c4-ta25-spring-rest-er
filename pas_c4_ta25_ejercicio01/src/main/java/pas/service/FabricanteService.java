/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.FabricanteDAO;
import pas.dto.Fabricante;

/**
 * @author paul_
 *
 */

@Service
public class FabricanteService implements FabricanteServiceInterface {

	@Autowired
	FabricanteDAO fabricanteDAO;
	
	@Override
	public List<Fabricante> listFabricantes() {
		return fabricanteDAO.findAll();
	}

	@Override
	public Fabricante saveFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante FabricanteById(Long id) {
		return fabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante updateFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long id) {
		fabricanteDAO.deleteById(id);
	}

}
