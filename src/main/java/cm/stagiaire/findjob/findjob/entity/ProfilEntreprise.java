package cm.stagiaire.findjob.findjob.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TABLE_PROFIL_ENTREPRISE")
public class ProfilEntreprise {
    @Id
    private String refEntreprise;
    @NotNull(message = "Ne doit pas être vide")
    private String designation;
    @NotNull
    private String siege;
}
