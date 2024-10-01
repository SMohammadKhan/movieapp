package moviea.movie123app;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class controller {

    private final MovieService movieService;

    public controller(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/save")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @PostMapping("/bulk")
    public List<Movie> saveBulk(@RequestBody List<Movie> movies) {
        return movieService.saveBulk(movies);
    }

    @GetMapping("/popular")
    public List<Movie> getPopularMovies() {
        return movieService.getPopularMovies();
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/find/{name}")
    public Movie findByName(@PathVariable String name) {
        return movieService.findByName(name);
    }

    @GetMapping("/upcoming")
    public List<Movie> getUpcomingMovies() {
        return movieService.getUpcomingMovies();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        return movieService.deleteMovie(id);
    }
}
