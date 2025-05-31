package pet.project.numapapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet.project.numapapi.entity.Place;
import pet.project.numapapi.service.PlaceService;

import java.util.List;

@RestController
@RequestMapping("/places")
@RequiredArgsConstructor
public class PlaceController {
    private final PlaceService placeService;
    @GetMapping("/all")
    public List<Place> getAllPlaces(){
        return placeService.getAllPlaces();
    }
}