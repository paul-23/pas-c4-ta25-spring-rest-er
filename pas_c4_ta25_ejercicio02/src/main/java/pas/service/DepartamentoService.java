/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.DepartamentoDAO;
import pas.dto.Departamento;

/**
 * @author paul_
 *
 */

@Service
public class DepartamentoService implements DepartamentoServiceInterface {

	@Autowired
	DepartamentoDAO departamentoDAO;

	@Override
	public List<Departamento> listDepartamentos() {
		return departamentoDAO.findAll();
	}

	@Override
	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoById(Long id) {
		return departamentoDAO.findById(id).get();
	}

	@Override
	public Departamento updateDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	@Override
	public void deleteDepartamento(Long id) {
		departamentoDAO.deleteById(id);
	}

}
