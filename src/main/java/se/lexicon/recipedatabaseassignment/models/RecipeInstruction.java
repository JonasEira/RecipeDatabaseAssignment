package se.lexicon.recipedatabaseassignment.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeInstruction {
    @Id
    int id;
    String instructions;
}
