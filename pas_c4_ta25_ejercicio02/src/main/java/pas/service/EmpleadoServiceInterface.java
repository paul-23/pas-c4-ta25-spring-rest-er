/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Empleado;

/**
 * @author paul_
 *
 */

public interface EmpleadoServiceInterface {

	public List<Empleado> listEmpleado();

	public Empleado saveEmpleado(Empleado empleado);

	public Empleado empleadoById(String dni);

	public Empleado updateEmpleado(Empleado empleado);

	public void deleteEmpleado(String dni);

}
