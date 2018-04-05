package ro.db.springboot.service;

import ro.db.springboot.service.dto.LocationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Location.
 */
public interface LocationService {

    /**
     * Save a location.
     *
     * @param locationDTO the entity to save
     * @return the persisted entity
     */
    LocationDTO save(LocationDTO locationDTO);

    /**
     * Get all the locations.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<LocationDTO> findAll(Pageable pageable);

    /**
     * Get the "id" location.
     *
     * @param id the id of the entity
     * @return the entity
     */
    LocationDTO findOne(Long id);

    /**
     * Delete the "id" location.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
