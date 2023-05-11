package cm.stagiaire.findjob.findjob.Service.Implementation;

import cm.stagiaire.findjob.findjob.Entities.Candidate;
import cm.stagiaire.findjob.findjob.Repositories.CandidateRepository;
import cm.stagiaire.findjob.findjob.Service.CandidateService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class CandidateServiceImplementation implements CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateServiceImplementation(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate addNewCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate getCandidate(Long candidateId) {
        return candidateRepository.findByCandidateId(candidateId);
    }

    @Override
    public Candidate updateCandidate(Long candidateId, Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public Boolean delete(Long candidateId) {
        candidateRepository.deleteById(candidateId);
        return Boolean.TRUE;
    }
}
