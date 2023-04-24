package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Almacen;

/**
 * @author paul_
 *
 */

public interface AlmacenDAO extends JpaRepository<Almacen, Long> {

}
