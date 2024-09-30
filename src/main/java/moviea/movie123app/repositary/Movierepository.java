package moviea.movie123app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moviea.movie123app.Entity.Movies;

@Repository
public interface Movierepository extends JpaRepository<Movies,Long> {

     
}
