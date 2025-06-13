package pet.project.numapapi.entity.repository;

import org.springframework.data.jpa.domain.Specification;
import pet.project.numapapi.entity.Place;

public class PlaceSpecification {

    public static Specification<Place> hasBlockId(Long blockId) {
        return (root, query, cb) -> blockId == null ? null : cb.equal(root.get("block").get("id"), blockId);
    }

    public static Specification<Place> hasTypeName(String typeName) {
        return (root, query, cb) -> typeName == null ? null : cb.equal(root.get("type").get("name"), typeName);
    }
}
