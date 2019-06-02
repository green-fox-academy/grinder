package greenfoxacademy.fox.user;

import greenfoxacademy.fox.fox.Fox;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @Column(length = 20)
    private String name;
    private String password;

    @OneToMany(mappedBy = "user")
    List<Fox> foxes;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }
}
