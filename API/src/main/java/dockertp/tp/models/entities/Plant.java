package dockertp.tp.models.entities;


import dockertp.tp.enums.PlantType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private Boolean isToxic;
    private Boolean isOwned;
    @Enumerated(EnumType.STRING)
    private PlantType type;
}
