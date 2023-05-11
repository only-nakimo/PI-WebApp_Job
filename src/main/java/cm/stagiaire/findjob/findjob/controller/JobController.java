package cm.stagiaire.findjob.findjob.controller;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/jobs")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public Job addJob(@RequestBody Job job){
        return this.jobService.addJob(job);
    }

    @GetMapping
    public List<Job> getClients(){
        return this.jobService.getJob();
    }

    @DeleteMapping("/{ref}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "ref") String ref){
        this.jobService.deleteById(ref);
        return ResponseEntity.ok("Job deleted successfully !");
    }

    @GetMapping("/{poste}")
    public Job getJob(@PathVariable(name = "poste") String poste){
        return this.jobService.getJob(poste);
    }


    @PutMapping("/{poste}")
    public ResponseEntity<String> updatePoste(@RequestBody Job job, @PathVariable(name = "poste") String poste){
        this.jobService.updateJob(job, poste);
        return ResponseEntity.ok("Job updated");
    }

}
