/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.PeliculaDAO;
import pas.dto.Pelicula;

/**
 * @author paul_
 *
 */

@Service
public class PeliculaService implements PeliculaServiceInterface {

	@Autowired
	PeliculaDAO peliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		return peliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long id) {
		return peliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return peliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		peliculaDAO.deleteById(id);
	}
}
