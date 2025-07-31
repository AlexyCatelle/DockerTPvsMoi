package dockertp.tp.interfaces;

import dockertp.tp.models.dto.PlantDTO;
import dockertp.tp.models.entities.Plant;

import java.util.List;
import java.util.UUID;

public interface IPlantService {
    List <PlantDTO> getAllPlants ();
    PlantDTO getPlantById(UUID id) throws Exception;
    PlantDTO createPlant(PlantDTO plantDTO) throws Exception;
    PlantDTO updatePlant(UUID id,PlantDTO plantDTO) throws Exception;
    void deletePlant(UUID id) throws Exception;
}
