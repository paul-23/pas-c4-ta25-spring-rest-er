package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Departamento;

/**
 * @author paul_
 *
 */

public interface DepartamentoDAO extends JpaRepository<Departamento, Long> {

}
