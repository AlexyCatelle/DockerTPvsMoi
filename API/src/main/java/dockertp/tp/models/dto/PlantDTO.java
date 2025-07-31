package dockertp.tp.models.dto;

import dockertp.tp.enums.PlantType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlantDTO {
    private UUID id;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;

    private Boolean isToxic;
    private Boolean isOwned;

    private PlantType type;
}
