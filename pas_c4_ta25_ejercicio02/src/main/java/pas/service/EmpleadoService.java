/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.EmpleadoDAO;
import pas.dto.Empleado;

/**
 * @author paul_
 *
 */

@Service
public class EmpleadoService implements EmpleadoServiceInterface {

	@Autowired
	EmpleadoDAO empleadoDAO;

	@Override
	public List<Empleado> listEmpleado() {
		return empleadoDAO.findAll();
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoById(String dni) {
		return empleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	@Override
	public void deleteEmpleado(String dni) {
		empleadoDAO.deleteById(dni);
	}

}
