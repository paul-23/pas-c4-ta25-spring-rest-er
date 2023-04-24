/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Articulo;

/**
 * @author paul_
 *
 */
public interface ArticuloServiceInterface {
	
	public List<Articulo> listArticulo();

	public Articulo saveArticulo(Articulo articulo);

	public Articulo ArticuloById(Long id);

	public Articulo updateArticulo(Articulo articulo);

	public void deleteArticulo(Long id);
	
}
