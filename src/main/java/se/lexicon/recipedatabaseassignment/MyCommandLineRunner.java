package se.lexicon.recipedatabaseassignment;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.recipedatabaseassignment.data.IngredientRepository;
import se.lexicon.recipedatabaseassignment.data.RecipeRepository;
import se.lexicon.recipedatabaseassignment.models.Ingredient;
import se.lexicon.recipedatabaseassignment.models.Recipe;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    public void run(String... args) throws Exception {
        Ingredient testIng = new Ingredient()
    }
}
