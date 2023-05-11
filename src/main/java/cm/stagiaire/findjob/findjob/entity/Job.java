package cm.stagiaire.findjob.findjob.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TABLE_JOB")
public class Job {
    @Id
    private String ref;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotBlank
    private String poste;
    @NotNull
    private String jobDescription;
    @NotNull
    private Long salaireMin;
    @NotNull
    private Long salaireMax;
}
