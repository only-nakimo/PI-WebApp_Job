package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Candidate;
import cm.stagiaire.findjob.findjob.repository.CandidateRepository;
import cm.stagiaire.findjob.findjob.service.CandidateService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class CandidateServiceImpl implements CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
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
