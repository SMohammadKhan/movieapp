package moviea.movie123app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mname;
    private String genre;
    private boolean ispopular;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isIspopular() {
        return ispopular;
    }
    public void setIspopular(boolean ispopular) {
        this.ispopular = ispopular;
    }
    public Movies(Long id, String mname, String genre, boolean ispopular) {
        this.id = id;
        this.mname = mname;
        this.genre = genre;
        this.ispopular = ispopular;
    }
    public Movies() {
    }

    
}