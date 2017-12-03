package spring.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.domain.Recipe;

/**
 * Created by danie on 01/12/2017.
 */
public interface RecipeRepository  extends CrudRepository<Recipe,Long>{
}
