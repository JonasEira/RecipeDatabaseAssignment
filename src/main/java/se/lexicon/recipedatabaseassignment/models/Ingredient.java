package se.lexicon.recipedatabaseassignment.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
    @Id
    int id;
    String name;
}
