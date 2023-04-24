/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.AlmacenDAO;
import pas.dto.Almacen;


/**
 * @author paul_
 *
 */

@Service
public class AlmacenService implements AlmacenServiceInterface {

	@Autowired
	AlmacenDAO almacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		return almacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long id) {
		return almacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		almacenDAO.deleteById(id);
	}

}
