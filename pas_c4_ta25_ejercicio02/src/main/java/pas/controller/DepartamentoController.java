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

import pas.dto.Departamento;
import pas.service.DepartamentoService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoService departamentoService;

	@GetMapping("/departamentos")
	public List<Departamento> listDepartamentos() {
		return departamentoService.listDepartamentos();
	}

	@GetMapping("/departamentos/{id}")
	public Departamento getDepartamentoById(@PathVariable(name = "id") Long id) {
		Departamento departamento = new Departamento();
		departamento = departamentoService.departamentoById(id);

		return departamento;
	}

	@PostMapping("/departamentos")
	public Departamento saveDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamento(departamento);
	}

	@PutMapping("/departamentos/{id}")
	public Departamento updateDepartamento(@PathVariable(name = "id") Long id, @RequestBody Departamento departamento) {
		Departamento selected_Departamento = new Departamento(id, departamento.getNombre(),
				departamento.getPresupuesto());
		Departamento updated_Departamento = new Departamento();

		updated_Departamento = departamentoService.updateDepartamento(selected_Departamento);
		return updated_Departamento;
	}

	@DeleteMapping("/departamentos/{id}")
	public void deleteDepartamento(@PathVariable(name = "id") Long id) {
		departamentoService.deleteDepartamento(id);
	}

}
