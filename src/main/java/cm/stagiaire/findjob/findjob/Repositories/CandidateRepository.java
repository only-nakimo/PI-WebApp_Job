package cm.stagiaire.findjob.findjob.Repositories;

import cm.stagiaire.findjob.findjob.Entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository <Candidate,Long>{
    Candidate findByCandidateId(Long candidateId);
}
