/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Sala;

/**
 * @author paul_
 *
 */
public interface SalaServiceInterface {

	public List<Sala> listarSalas();

	public Sala guardarSala(Sala sala);

	public Sala salaXID(Long id);

	public Sala actualizarSala(Sala sala);

	public void eliminarSala(Long id);

}
