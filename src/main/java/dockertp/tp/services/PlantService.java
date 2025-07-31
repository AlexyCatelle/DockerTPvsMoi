package dockertp.tp.services;

import dockertp.tp.interfaces.IPlantService;
import dockertp.tp.mappers.PlantMapper;
import dockertp.tp.models.dto.PlantDTO;
import dockertp.tp.models.entities.Plant;
import dockertp.tp.repositories.PlantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlantService implements IPlantService {
    private PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public List<PlantDTO> getAllPlants() {
        List<Plant> plants = plantRepository.findAll();
        return PlantMapper.plantsToPlantDTOs(plants);
    }

    @Override
    public PlantDTO getPlantById(UUID id) throws Exception {
        return null;
    }

    @Override
    public PlantDTO createPlant(PlantDTO plantDTO) throws Exception {
        return null;
    }

    @Override
    public PlantDTO updatePlant(UUID id, PlantDTO plantDTO) throws Exception {
        return null;
    }

    @Override
    public void deletePlant(UUID id) throws Exception {

    }
}
