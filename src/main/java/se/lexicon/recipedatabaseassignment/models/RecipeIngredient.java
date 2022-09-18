package se.lexicon.recipedatabaseassignment.models;

import se.lexicon.recipedatabaseassignment.helper.Measurement;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    UUID id;
    @OneToOne
    Ingredient ingredient;
    double amount;
    Measurement measurement;
    @ManyToOne(cascade = CascadeType.ALL)
    Recipe recipe;
}
