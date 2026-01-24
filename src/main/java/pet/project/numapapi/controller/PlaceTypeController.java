package pet.project.numapapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pet.project.numapapi.entity.PlaceTypeDictionary;
import pet.project.numapapi.service.PlaceTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/placetypes")
@RequiredArgsConstructor
public class PlaceTypeController {

    private final PlaceTypeService placeTypeService;

    @GetMapping
    public List<PlaceTypeDictionary> getAllPlaceTypes() {
        return placeTypeService.getAllPlaceTypes();
    }

    @GetMapping("/{id}")
    public PlaceTypeDictionary getPlaceTypeById(@PathVariable Long id) {
        return placeTypeService.getPlaceTypeById(id)
                .orElseThrow(() -> new RuntimeException("PlaceType not found"));
    }

    @PostMapping
    public PlaceTypeDictionary createPlaceType(@RequestBody PlaceTypeDictionary placeType) {
        return placeTypeService.createPlaceType(placeType);
    }

    @PutMapping("/{id}")
    public PlaceTypeDictionary updatePlaceType(@PathVariable Long id,
                                               @RequestBody PlaceTypeDictionary updatedPlaceType) {
        return placeTypeService.updatePlaceType(id, updatedPlaceType)
                .orElseThrow(() -> new RuntimeException("PlaceType not found"));
    }

    @DeleteMapping("/{id}")
    public void deletePlaceType(@PathVariable Long id) {
        placeTypeService.deletePlaceType(id);
    }
}

