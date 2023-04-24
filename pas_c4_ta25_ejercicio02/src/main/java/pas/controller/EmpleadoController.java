/**
 * 
 */
package pas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pas.dto.Empleado;
import pas.service.EmpleadoService;

/**
 * @author paul_
 *
 */

@RestController // Rest controller
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> listEmpleados() {
		return empleadoService.listEmpleado();
	}

	@GetMapping("/empleados/{dni}")
	public Empleado getEmpleadoById(@PathVariable(name = "dni") String dni) {
		Empleado empleado = new Empleado();
		empleado = empleadoService.empleadoById(dni);

		return empleado;
	}

	@PostMapping("/empleados")
	public Empleado saveEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.saveEmpleado(empleado);
	}

	@PutMapping("/empleados/{dni}")
	public Empleado updateEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {
		Empleado selected_Empleado = new Empleado(dni, empleado.getNombre(), empleado.getApellido(),
				empleado.getDepartamento());
		Empleado updated_Empleado = new Empleado();

		updated_Empleado = empleadoService.updateEmpleado(selected_Empleado);
		return updated_Empleado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void deleteEmpleado(@PathVariable(name = "dni") String dni) {
		empleadoService.deleteEmpleado(dni);
	}
	
}
