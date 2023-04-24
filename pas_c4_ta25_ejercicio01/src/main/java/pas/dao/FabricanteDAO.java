/**
 * 
 */
package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Fabricante;

/**
 * @author paul_
 *
 */

public interface FabricanteDAO extends JpaRepository<Fabricante, Long> {

}
