package spring.guru.services;

import spring.guru.domain.Recipe;

import java.util.Set;

/**
 * Created by danie on 03/12/2017.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
