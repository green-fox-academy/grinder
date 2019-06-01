package greenfoxacademy.fox.fox;

import greenfoxacademy.fox.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fox {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String color;

    @ManyToOne
    User user;

    public Fox() {

    }

    public Fox(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
