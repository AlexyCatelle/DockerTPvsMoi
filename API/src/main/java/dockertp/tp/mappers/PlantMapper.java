package dockertp.tp.mappers;

import dockertp.tp.models.dto.PlantDTO;
import dockertp.tp.models.entities.Plant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlantMapper {

    public static PlantDTO plantToPlantDTO (Plant plant){
        return new PlantDTO(
                plant.getId(),
                plant.getName(),
                plant.getIsToxic(),
                plant.getIsOwned(),
                plant.getType())
                ;
    }

    public static List<PlantDTO> plantsToPlantDTOs (List<Plant> plants){
        return plants.stream().map(PlantMapper::plantToPlantDTO).toList();
    }

    public static Plant plantDTOToPlant(PlantDTO plantDTO){
        return new Plant(
                null,
                plantDTO.getName(),
                plantDTO.getIsToxic(),
                plantDTO.getIsOwned(),
                plantDTO.getType())
                ;
    }

    public static List<Plant> plantsToPlants (List<PlantDTO> plantDTOs){
        return plantDTOs.stream().map(PlantMapper::plantDTOToPlant).collect(Collectors.toList());
    }
}
