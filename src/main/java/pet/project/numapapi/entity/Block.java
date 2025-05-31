package pet.project.numapapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Block{
    @Id
    private Long id;
    private String name;
    private String code;
}