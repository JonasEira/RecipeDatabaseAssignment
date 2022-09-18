package se.lexicon.recipedatabaseassignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipedatabaseassignment.models.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
