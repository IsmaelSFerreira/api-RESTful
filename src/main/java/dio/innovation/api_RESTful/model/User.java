package dio.innovation.api_RESTful.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(
    name = "db_users"
)
public class User {
    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    Long id;
    String nome;
    String email;
    int age;
    String address;
    @OneToMany(
        mappedBy = "user",
        cascade = {CascadeType.ALL}
    )
    private List<Games> games;

    public User() {
    }

    public User(Long id, String nome, String email, int age, String address) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public User(Long userId) {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Games> getGames() {
        return this.games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }
}

