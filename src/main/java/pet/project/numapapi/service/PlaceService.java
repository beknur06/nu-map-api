package pet.project.numapapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pet.project.numapapi.entity.Place;
import pet.project.numapapi.entity.repository.PlaceRepository;

import java.util.List;

@Service
public class PlaceService{
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}