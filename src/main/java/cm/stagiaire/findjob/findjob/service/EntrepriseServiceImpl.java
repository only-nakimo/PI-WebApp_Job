package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.entity.ProfilEntreprise;
import cm.stagiaire.findjob.findjob.repository.EntrepriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements EntrepriseService{
    private final EntrepriseRepository entrepriseRepository;

    public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public ProfilEntreprise addProfilEntreprise(ProfilEntreprise profilEntreprise) {
        return this.entrepriseRepository.save(profilEntreprise);
    }

    @Override
    public ProfilEntreprise getProfilEntreprise(String designation) {
        return this.entrepriseRepository.findByDesignation(designation);
    }

    @Override
    public List<ProfilEntreprise> getProfilEntreprise() {
        return this.entrepriseRepository.findAll();
    }

    @Override
    public void deleteById(String refEntreprise) {
        this.entrepriseRepository.deleteById(refEntreprise);
    }

    @Override
    public ProfilEntreprise updateProfilEntreprise(ProfilEntreprise profilEntreprise, String designation) {
          ProfilEntreprise oldProfilEntreprise = this.entrepriseRepository.findByDesignation(designation);
          //oldProfilEntreprise.setRefEntreprise(profilEntreprise.getRefEntreprise());
          oldProfilEntreprise.setDesignation(profilEntreprise.getDesignation());
          oldProfilEntreprise.setSiege(profilEntreprise.getSiege());
          this.entrepriseRepository.save(oldProfilEntreprise);
        return null;
    }

}
