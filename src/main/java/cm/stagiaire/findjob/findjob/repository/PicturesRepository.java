package cm.stagiaire.findjob.findjob.repository;

import cm.stagiaire.findjob.findjob.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.File;

public interface PicturesRepository extends JpaRepository<Picture, String> {
    void deleteById( String refPricture);
    Picture findByFileName(String fileName);
}
