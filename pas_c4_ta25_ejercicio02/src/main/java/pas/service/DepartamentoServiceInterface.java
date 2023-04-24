/**
 * 
 */
package pas.service;

import java.util.List;
import pas.dto.Departamento;

/**
 * @author paul_
 *
 */
public interface DepartamentoServiceInterface {

	public List<Departamento> listDepartamentos();

	public Departamento saveDepartamento(Departamento departamento);

	public Departamento departamentoById(Long id);

	public Departamento updateDepartamento(Departamento departamento);

	public void deleteDepartamento(Long id);

}
