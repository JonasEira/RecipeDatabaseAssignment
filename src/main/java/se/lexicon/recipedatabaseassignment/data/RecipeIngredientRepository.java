package se.lexicon.recipedatabaseassignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipedatabaseassignment.models.RecipeIngredient;

import java.util.UUID;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, UUID> {
}
