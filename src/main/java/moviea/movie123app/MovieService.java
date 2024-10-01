package moviea.movie123app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> saveBulk(List<Movie> movies) {
        return movieRepository.saveAll(movies);
    }

    public List<Movie> getPopularMovies() {
        return movieRepository.findByIsPopularTrue();
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    public Movie findByName(String name) {
        return movieRepository.findByTitle(name);
    }

    public List<Movie> getUpcomingMovies() {
        LocalDate today = LocalDate.now();
        return movieRepository.findUpcomingMovies(today);
    }

    public String deleteMovie(Long id) {
        movieRepository.deleteById(id);
        return "Movie deleted successfully.";
    }
}
