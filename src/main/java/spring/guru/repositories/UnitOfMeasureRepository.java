package spring.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by danie on 01/12/2017.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
