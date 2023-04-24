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

import pas.dto.Almacen;
import pas.service.AlmacenService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenService almacenService;

	@GetMapping("/almacenes")
	public List<Almacen> listAlmacenes() {
		return almacenService.listarAlmacenes();
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenById(@PathVariable(name = "id") Long id) {
		Almacen almacenxID = new Almacen();

		almacenxID = almacenService.almacenXID(id);

		return almacenxID;
	}

	@PostMapping("/almacenes")
	public Almacen saveAlmacen(@RequestBody Almacen almacen) {
		return almacenService.guardarAlmacen(almacen);
	}

	@PutMapping("/almacenes/{id}")
	public Almacen updateAlmacen(@PathVariable(name = "id") Long id, @RequestBody Almacen almacen) {
		Almacen selectedAlmacen = new Almacen(id, almacen.getLugar(), almacen.getCapacidad());
		Almacen updatedAlmacen = new Almacen();

		updatedAlmacen = almacenService.actualizarAlmacen(selectedAlmacen);
		return updatedAlmacen;
	}

	@DeleteMapping("/almacenes/{id}")
	public void deleteAlmacen(@PathVariable(name = "id") Long id) {
		almacenService.eliminarAlmacen(id);
	}
	
}
