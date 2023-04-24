/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Fabricante;

/**
 * @author paul_
 *
 */
public interface FabricanteServiceInterface {
	
	public List<Fabricante> listFabricantes();

	public Fabricante saveFabricante(Fabricante fabricante);

	public Fabricante FabricanteById(Long id);

	public Fabricante updateFabricante(Fabricante fabricante);

	public void deleteFabricante(Long id);
	
}
