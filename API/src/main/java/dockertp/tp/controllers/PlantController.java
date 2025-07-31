package dockertp.tp.controllers;

import dockertp.tp.interfaces.IPlantService;
import dockertp.tp.models.dto.PlantDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlantController {

private IPlantService plantService;

public PlantController(IPlantService plantService){
    this.plantService = plantService;
}

@GetMapping("/plants")
    public ResponseEntity<List<PlantDTO>> getAllPlants(){
    return new ResponseEntity<>(plantService.getAllPlants(), HttpStatus.OK);
}

}

//    * `GET /api/v1/dogs`: Listing des chiens
//* `GET /api/v1/dogs/{dogId}`: Récupération d'un chien et de ses détails
//            * `POST /api/v1/dogs`: Ajout d'un nouveau chien à notre base de données
//            * `PUT /api/v1/dogs/{dogId}`: Edition d'un chien via son ID
//            * `DELETE /api/v1/dogs/{dogId}`: Suppression d'un chien via son ID