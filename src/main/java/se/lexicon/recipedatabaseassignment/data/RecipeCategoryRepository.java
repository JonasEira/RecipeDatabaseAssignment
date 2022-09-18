package se.lexicon.recipedatabaseassignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipedatabaseassignment.models.RecipeCategory;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {
}
