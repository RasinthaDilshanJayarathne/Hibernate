package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private String psId;
    private String name;

    public Person() {
    }

    public Person(String psId, String name) {
        this.setPsId(psId);
        this.setName(name);
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "psId='" + psId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
