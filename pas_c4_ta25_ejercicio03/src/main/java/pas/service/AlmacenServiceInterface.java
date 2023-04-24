/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Almacen;

/**
 * @author paul_
 *
 */
public interface AlmacenServiceInterface {

	public List<Almacen> listarAlmacenes();

	public Almacen guardarAlmacen(Almacen almacen);

	public Almacen almacenXID(Long id);

	public Almacen actualizarAlmacen(Almacen almacen);

	public void eliminarAlmacen(Long id);

}
