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
    private String imageUrl;
    @ManyToOne
    private Block block;
    @ManyToOne
    private PlaceTypeDictionary placeTypeDictionary;
//    @ManyToOne
    private Location location;
}
