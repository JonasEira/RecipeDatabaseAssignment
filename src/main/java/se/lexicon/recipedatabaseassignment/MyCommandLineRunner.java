package se.lexicon.recipedatabaseassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.recipedatabaseassignment.data.IngredientRepository;
import se.lexicon.recipedatabaseassignment.data.RecipeIngredientRepository;
import se.lexicon.recipedatabaseassignment.data.RecipeRepository;
import se.lexicon.recipedatabaseassignment.helper.Measurement;
import se.lexicon.recipedatabaseassignment.models.Ingredient;
import se.lexicon.recipedatabaseassignment.models.Recipe;
import se.lexicon.recipedatabaseassignment.models.RecipeIngredient;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    IngredientRepository ingreRepo;
    @Autowired
    RecipeIngredientRepository recIngRepo;
    @Autowired
    RecipeRepository recRepo;

    @Override
    public void run(String... args) throws Exception {
        Ingredient salt = new Ingredient("Salt");
        ingreRepo.save(salt);
        Ingredient water = new Ingredient("Water");
        ingreRepo.save(water);
        Recipe saltWaterRecipe = new Recipe("Saltwater");
        recRepo.save(saltWaterRecipe);
        RecipeIngredient recSalt = new RecipeIngredient(salt, 1.0, Measurement.CL, saltWaterRecipe);
        RecipeIngredient recWater = new RecipeIngredient(water, 1.0, Measurement.CL, saltWaterRecipe);
        recIngRepo.save(recSalt);
        recIngRepo.save(recWater);
        List<RecipeIngredient> ingredients = new ArrayList<>();
        ingredients.add(recSalt);
        ingredients.add(recWater);
        saltWaterRecipe.setRecipeIngredients(ingredients);

        ingreRepo.findAll().forEach(System.out::println);
        recRepo.findAll().forEach(System.out::println);

    }
}
