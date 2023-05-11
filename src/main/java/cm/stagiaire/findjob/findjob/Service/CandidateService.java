package cm.stagiaire.findjob.findjob.Service;

import cm.stagiaire.findjob.findjob.Entities.Candidate;

import java.util.List;

public interface CandidateService {
    Candidate addNewCandidate(Candidate candidate);
    List<Candidate> getCandidates();
    Candidate getCandidate(Long candidateId);
    Candidate updateCandidate(Long candidateId, Candidate candidate);
    Boolean delete(Long candidateId);
}
