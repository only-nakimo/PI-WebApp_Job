package cm.stagiaire.findjob.findjob.controller;

import cm.stagiaire.findjob.findjob.entity.Job;
import cm.stagiaire.findjob.findjob.entity.Picture;
import cm.stagiaire.findjob.findjob.service.PictureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pictures")
public class PictureController {
    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @PostMapping
    public Job addPicture(@RequestBody Picture picture){
        return null;
    }

    @GetMapping
    public List<Picture> getPicture(){
        return this.pictureService.getPicture();
    }
}
