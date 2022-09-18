package se.lexicon.recipedatabaseassignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipedatabaseassignment.models.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {
}
