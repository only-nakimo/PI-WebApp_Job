package cm.stagiaire.findjob.findjob.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TABLE_PROFIL_ENTREPRISE")
public class ProfilEntreprise {
    @OneToMany
    private Collection<Job> jobs;

    @Id
    private String refEntreprise;
    @NotNull(message = "Ne doit pas être vide")
    private String designation;
    @NotNull
    private String siege;
}
