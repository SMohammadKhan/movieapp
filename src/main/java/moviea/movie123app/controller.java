package moviea.movie123app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moviea.movie123app.Entity.Movies;

@RestController
@RequestMapping("/api/movies")
public class controller {
    
    private final MovieSerive movieService;

public controller(MovieSerive movieService) {
        this.movieService = movieService;
    }

    @PostMapping("saveMovies")  //Saving the data means postmapping
    public Movies saved(@RequestBody Movies m) { //here we're loading entire entity class so request body
    return movieService.saved(m);   //we've override autowired annotation so that y savedata

}

}

