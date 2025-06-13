package pet.project.numapapi.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pet.project.numapapi.entity.PlaceTypeDictionary;
import pet.project.numapapi.entity.repository.PlaceTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceTypeService {

    private final PlaceTypeRepository placeTypeRepository;

    public List<PlaceTypeDictionary> getAllPlaceTypes() {
        return placeTypeRepository.findAll();
    }

    public Optional<PlaceTypeDictionary> getPlaceTypeById(Long id) {
        return placeTypeRepository.findById(id);
    }

    public PlaceTypeDictionary createPlaceType(PlaceTypeDictionary placeType) {
        return placeTypeRepository.save(placeType);
    }

    public Optional<PlaceTypeDictionary> updatePlaceType(Long id, PlaceTypeDictionary updatedPlaceType) {
        return placeTypeRepository.findById(id).map(existingPlaceType -> {
            existingPlaceType.setName(updatedPlaceType.getName());
            // update other fields if you have any
            return placeTypeRepository.save(existingPlaceType);
        });
    }

    public void deletePlaceType(Long id) {
        placeTypeRepository.deleteById(id);
    }
}

