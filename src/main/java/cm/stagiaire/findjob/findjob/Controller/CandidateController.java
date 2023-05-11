package cm.stagiaire.findjob.findjob.Controller;

import cm.stagiaire.findjob.findjob.Entities.Candidate;
import cm.stagiaire.findjob.findjob.Service.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/candidates")
@RestController

public class CandidateController {
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
    @PostMapping
    public ResponseEntity<Candidate> addNewCandidate(@RequestBody Candidate candidate) {
        return ResponseEntity.ok(this.candidateService.addNewCandidate(candidate));
    }

    @GetMapping
    public ResponseEntity<List<Candidate>> getCandidates() {
        return ResponseEntity.ok(this.candidateService.getCandidates());
    }

    @GetMapping("/{candidateId}")
    public ResponseEntity<Candidate> getCandidate(@PathVariable(name = "candidateId") Long candidateId) {
        return ResponseEntity.ok(this.candidateService.getCandidate(candidateId));
    }

    @PutMapping("/{candidateId}")
    public ResponseEntity<Candidate> updateCandidate(@RequestBody Candidate candidate, @PathVariable(name = "candidateId") Long candidateId) {
        return ResponseEntity.ok(this.candidateService.updateCandidate(candidateId, candidate));
    }

    @DeleteMapping("/{candidateId}")
    public ResponseEntity<String> deleteCandidate(@PathVariable(name = "candidateId") Long candidateId) {
        return ResponseEntity.ok("candidate cancellation over !");
    }

}
