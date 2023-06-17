package cm.stagiaire.findjob.findjob.repository;

import cm.stagiaire.findjob.findjob.entity.Candidate;
import cm.stagiaire.findjob.findjob.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository <Candidate,Long>{
    Candidate findByCandidateId(Long candidateId);
}
