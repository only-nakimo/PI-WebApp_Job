package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements  JobService{
    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @Override
    public Job addJob(Job job) {
        return this.jobRepository.save(job);
    }

    @Override
    public List<Job> getJob() {
        return this.jobRepository.findAll();
    }

    @Override
    public void deleteById(String ref) {
        this.jobRepository.deleteById(ref);
    }

    @Override
    public Job getJob(String poste) {
        return this.jobRepository.findByPosteIgnoreCase(poste);
    }

    @Override
    public Job updateJob(Job job, String poste) {
        Job oldJob = this.jobRepository.findByPosteIgnoreCase(poste);
        oldJob.setId(job.getId());
        oldJob.setPoste(job.getPoste());
        oldJob.setJobDescription(job.getJobDescription());
        oldJob.setSalaireMax(job.getSalaireMax());
        oldJob.setSalaireMin(job.getSalaireMin());
        this.jobRepository.save(oldJob);
        return null;

    }

}