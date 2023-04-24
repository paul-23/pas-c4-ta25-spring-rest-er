/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.ArticuloDAO;
import pas.dto.Articulo;

/**
 * @author paul_
 *
 */

@Service
public class ArticuloService implements ArticuloServiceInterface {

	@Autowired
	ArticuloDAO articuloDAO;
	
	@Override
	public List<Articulo> listArticulo() {
		return articuloDAO.findAll();
	}

	@Override
	public Articulo saveArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	@Override
	public Articulo ArticuloById(Long id) {
		return articuloDAO.findById(id).get();
	}

	@Override
	public Articulo updateArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	@Override
	public void deleteArticulo(Long id) {
		articuloDAO.deleteById(id);
	}

}
