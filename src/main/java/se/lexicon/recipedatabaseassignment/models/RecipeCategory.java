package se.lexicon.recipedatabaseassignment.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;
@Entity
public class RecipeCategory {
    @Id
    int id;
    String category;
    @ManyToMany
    Set<Recipe> recipe;
}
