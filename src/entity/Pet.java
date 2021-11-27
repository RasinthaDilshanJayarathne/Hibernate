package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    private
    String Pid;
    private String name;
    @ManyToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String pid, String name, Owner owner) {
        setPid(pid);
        this.setName(name);
        this.setOwner(owner);
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        Pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Pid='" + Pid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
