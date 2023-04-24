package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Pelicula;

/**
 * @author paul_
 *
 */

public interface PeliculaDAO extends JpaRepository<Pelicula, Long> {

}
