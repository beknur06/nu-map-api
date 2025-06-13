package pet.project.numapapi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pet.project.numapapi.entity.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {

}
