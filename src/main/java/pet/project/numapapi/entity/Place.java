package pet.project.numapapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Place{
    @Id
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private PlaceTypeDictionary placeTypeDictionary;
    @ManyToOne
    private Block block;
}
