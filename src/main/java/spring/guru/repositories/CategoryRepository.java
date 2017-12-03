package spring.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.domain.Category;

import java.util.Optional;

/**
 * Created by danie on 01/12/2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
