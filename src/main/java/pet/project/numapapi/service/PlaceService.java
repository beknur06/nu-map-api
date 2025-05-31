package pet.project.numapapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pet.project.numapapi.entity.Place;
import pet.project.numapapi.entity.repository.PlaceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService{
    private final PlaceRepository placeRepository;
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}