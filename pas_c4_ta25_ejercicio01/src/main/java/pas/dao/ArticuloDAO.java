/**
 * 
 */
package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Articulo;

/**
 * @author paul_
 *
 */

public interface ArticuloDAO extends JpaRepository<Articulo, Long> {

}
