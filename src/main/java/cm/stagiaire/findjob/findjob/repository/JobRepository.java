package cm.stagiaire.findjob.findjob.repository;

import cm.stagiaire.findjob.findjob.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
    Job findByPosteIgnoreCase(String poste);
    void deleteById(String ref);
}
