package pet.project.numapapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PlaceTypeDictionary{
    @Id
    private Long id;
    private String name;
}
