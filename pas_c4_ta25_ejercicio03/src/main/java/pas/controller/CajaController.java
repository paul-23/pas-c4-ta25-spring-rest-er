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

import pas.dto.Caja;
import pas.service.CajaService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaService cajaService;

	@GetMapping("/cajas")
	public List<Caja> listCajas() {
		return cajaService.listarCajas();
	}

	@GetMapping("/cajas/{num_referencia}")
	public Caja cajaById(@PathVariable(name = "num_referencia") String num_referencia) {
		Caja cajaById = new Caja();
		cajaById = cajaService.cajaXID(num_referencia);
		return cajaById;
	}

	@PostMapping("/cajas")
	public Caja saveCaja(@RequestBody Caja caja) {
		return cajaService.guardarCaja(caja);
	}

	@PutMapping("/cajas/{num_referencia}")
	public Caja updateCaja(@PathVariable(name = "num_referencia") String num_referencia, @RequestBody Caja caja) {
		Caja caja_Selected = new Caja(num_referencia, caja.getContenido(), caja.getValor(), caja.getAlmacen());
		Caja caja_Updated = new Caja();

		caja_Updated = cajaService.actualizarCaja(caja_Selected);

		return caja_Updated;
	}

	@DeleteMapping("/cajas/{num_referencia}")
	public void deleteCaja(@PathVariable(name = "num_referencia") String num_referencia) {
		cajaService.eliminarCaja(num_referencia);
	}

}
