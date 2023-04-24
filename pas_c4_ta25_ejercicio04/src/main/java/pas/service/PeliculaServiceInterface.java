/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Pelicula;

/**
 * @author paul_
 *
 */

public interface PeliculaServiceInterface {

	public List<Pelicula> listarPeliculas();

	public Pelicula guardarPelicula(Pelicula pelicula);

	public Pelicula peliculaXID(Long id);

	public Pelicula actualizarPelicula(Pelicula pelicula);

	public void eliminarPelicula(Long id);

}
