package cm.stagiaire.findjob.findjob.repository;

import cm.stagiaire.findjob.findjob.entity.ProfilEntreprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntrepriseRepository extends JpaRepository<ProfilEntreprise, String>{
   void deleteById(String refEntreprise);
   ProfilEntreprise findByDesignation(String designation);
}
