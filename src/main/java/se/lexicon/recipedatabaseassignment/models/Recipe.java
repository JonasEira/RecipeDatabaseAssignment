package se.lexicon.recipedatabaseassignment.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
public class Recipe {
    @Id
    int id;
    String recipeName;
    @OneToMany
    List<RecipeIngredient> recipeIngredients;
    @OneToOne
    RecipeInstruction instruction;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    Set<RecipeCategory> categories;

}
