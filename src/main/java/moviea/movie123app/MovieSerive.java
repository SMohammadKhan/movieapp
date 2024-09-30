package moviea.movie123app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moviea.movie123app.Entity.Movies;
import moviea.movie123app.repositary.Movierepository;

@Service
public class MovieSerive {
    
    public Movies saved(Movies m) {
        return movierepository.save(m);
    }

    private final Movierepository movierepository;

    public MovieSerive(Movierepository movierepository) {  // constructor
        this.movierepository = movierepository;
    }

}
