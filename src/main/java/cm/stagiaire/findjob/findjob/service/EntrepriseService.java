package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.entity.ProfilEntreprise;

import java.util.List;

public interface EntrepriseService {
    ProfilEntreprise addProfilEntreprise(ProfilEntreprise profilEntreprise);
    ProfilEntreprise getProfilEntreprise(String designation);
    List<ProfilEntreprise> getProfilEntreprise();
    void deleteById(String refEntreprise);
    ProfilEntreprise updateProfilEntreprise(ProfilEntreprise profilEntreprise, String refEntreprise);
}
