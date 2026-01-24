package pet.project.numapapi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pet.project.numapapi.entity.PlaceTypeDictionary;

@Repository
public interface PlaceTypeRepository extends JpaRepository<PlaceTypeDictionary, Long> {

}
