package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.entity.Picture;

import java.io.File;
import java.util.List;

public interface PictureService {
    Picture addPicture(Picture picture);
    List<Picture> getPicture();
    void deleteById(String refPicture);
    Picture updatePicture(Picture picture, String fileName);
    Picture getPictures(String refPicture);
}
