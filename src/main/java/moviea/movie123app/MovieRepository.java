package moviea.movie123app;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByTitle(String title);

    List<Movie> findByGenre(String genre);

    List<Movie> findByIsPopularTrue();

    @Query("SELECT m FROM Movie m WHERE m.releaseDate >= :today")
    List<Movie> findUpcomingMovies(@Param("today") LocalDate today);
}
