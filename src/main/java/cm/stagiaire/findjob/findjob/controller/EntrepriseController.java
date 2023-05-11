package cm.stagiaire.findjob.findjob.controller;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.entity.ProfilEntreprise;
import cm.stagiaire.findjob.findjob.service.EntrepriseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/entreprise")
public class EntrepriseController {
    private final EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {

        this.entrepriseService = entrepriseService;
    }

    @PostMapping
    public ProfilEntreprise addProfilEntreprise(@RequestBody ProfilEntreprise profilEntreprise){
        return this.entrepriseService.addProfilEntreprise(profilEntreprise);
    }

    @GetMapping
    public List<ProfilEntreprise> getProfilEntreprise(){
        return this.entrepriseService.getProfilEntreprise();
    }

    @DeleteMapping("/{refEntreprise}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "refEntreprise") String refEntreprise){
        this.entrepriseService.deleteById(refEntreprise);
        return ResponseEntity.ok("Entreprise deleted successfully !");
    }

    @GetMapping("/{designation}")
    public ProfilEntreprise getProfilEntreprise(@PathVariable(name = "designation") String designation){
        return this.entrepriseService.getProfilEntreprise(designation);
    }


    @PutMapping("/{designation}")
    public ResponseEntity<String> updateProfilEntreprise(@RequestBody ProfilEntreprise profilEntreprise, @PathVariable(name = "designation") String designation){
        this.entrepriseService.updateProfilEntreprise(profilEntreprise, designation);
        return ResponseEntity.ok("Entreprise updated");
    }

}
