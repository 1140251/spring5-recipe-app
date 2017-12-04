package spring.guru.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by danie on 28/11/2017.
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
