package spring.guru.services;

import org.springframework.stereotype.Service;
import spring.guru.domain.Recipe;
import spring.guru.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by danie on 03/12/2017.
 */
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
