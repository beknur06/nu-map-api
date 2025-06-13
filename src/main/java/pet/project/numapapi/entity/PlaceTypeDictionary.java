package pet.project.numapapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PlaceTypeDictionary{
    @Id @GeneratedValue
    private Long id;
    private String name; // Coffee, Shop
}
