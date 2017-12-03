package spring.guru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.guru.domain.Category;
import spring.guru.domain.UnitOfMeasure;
import spring.guru.repositories.CategoryRepository;
import spring.guru.repositories.UnitOfMeasureRepository;
import spring.guru.services.RecipeService;

import java.util.Optional;

/**
 * Created by danie on 27/11/2017.
 */
@Controller
public class indexController {


    private final RecipeService recipeService;

    public indexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
