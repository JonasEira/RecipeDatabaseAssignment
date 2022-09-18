package se.lexicon.recipedatabaseassignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipedatabaseassignment.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
