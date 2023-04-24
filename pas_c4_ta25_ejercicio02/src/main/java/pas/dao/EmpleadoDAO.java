package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Empleado;

/**
 * @author paul_
 *
 */

public interface EmpleadoDAO extends JpaRepository<Empleado, String> {

}
