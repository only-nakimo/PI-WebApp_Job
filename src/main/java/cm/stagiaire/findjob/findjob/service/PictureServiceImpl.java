package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Picture;
import cm.stagiaire.findjob.findjob.repository.PicturesRepository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {
   private final PicturesRepository picturesRepository;

    public PictureServiceImpl(PicturesRepository picturesRepository) {
        this.picturesRepository = picturesRepository;
    }


    @Override
    public Picture addPicture(Picture picture) {

        return this.picturesRepository.save(picture);
    }

    @Override
    public List<Picture> getPicture() {
        return null;
    }

    @Override
    public void deleteById(String refPicture) {

    }

    @Override
    public Picture updatePicture(Picture picture, String fileName) {
        return null;
    }

    @Override
    public Picture getPictures(String refPicture) {
        return null;
    }
}
