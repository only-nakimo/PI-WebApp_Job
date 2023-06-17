package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Candidate;
import cm.stagiaire.findjob.findjob.entity.Candidate;
import cm.stagiaire.findjob.findjob.entity.Job;
import jakarta.persistence.OneToMany;

import java.util.List;

public interface CandidateService {
    Candidate addNewCandidate(Candidate candidate);
    List<Candidate> getCandidates();
    Candidate getCandidate(Long candidateId);
    Candidate updateCandidate(Long candidateId, Candidate candidate);
    Boolean delete(Long candidateId);
}
