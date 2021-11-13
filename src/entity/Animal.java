package entity;

import embeded.Name;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private String id;
    @Embedded
    private Name name;

    public Animal() {
    }

    public Animal(String id, Name name) {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
