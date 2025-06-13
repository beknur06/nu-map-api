package pet.project.numapapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Block{
    @Id @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Place> places;
}