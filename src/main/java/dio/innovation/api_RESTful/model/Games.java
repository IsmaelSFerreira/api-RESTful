package dio.innovation.api_RESTful.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Games {
    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    Long id;
    String gameTitle;
    LocalDate date;
    LocalDate gameDateLaunch;
    int gameNote;
    @ManyToOne
    @JoinColumn(
        name = "user_id"
    )
    private User user;

    public Games() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameTitle() {
        return this.gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getGameDateLaunch() {
        return this.gameDateLaunch;
    }

    public void setGameDateLaunch(LocalDate gameDateLaunch) {
        this.gameDateLaunch = gameDateLaunch;
    }

    public int getGameNote() {
        return this.gameNote;
    }

    public void setGameNote(int gameNote) {
        this.gameNote = gameNote;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

