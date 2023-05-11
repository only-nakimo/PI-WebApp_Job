package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Job;

import java.util.List;

public interface JobService {
    Job addJob(Job job);
    List<Job> getJob();
    void deleteById(String ref);
    Job updateJob(Job job, String poste);
    Job getJob(String poste);
}
