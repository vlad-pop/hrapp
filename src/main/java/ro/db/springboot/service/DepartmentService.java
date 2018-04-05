package ro.db.springboot.service;

import ro.db.springboot.service.dto.DepartmentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Department.
 */
public interface DepartmentService {

    /**
     * Save a department.
     *
     * @param departmentDTO the entity to save
     * @return the persisted entity
     */
    DepartmentDTO save(DepartmentDTO departmentDTO);

    /**
     * Get all the departments.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<DepartmentDTO> findAll(Pageable pageable);

    /**
     * Get the "id" department.
     *
     * @param id the id of the entity
     * @return the entity
     */
    DepartmentDTO findOne(Long id);

    /**
     * Delete the "id" department.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
