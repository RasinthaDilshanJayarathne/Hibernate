package entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    private
    String Oid;
    private String name;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Pet> petList = new ArrayList();

    public Owner() {
    }

    public Owner(String oid, String name, List<Pet> petList) {
        setOid(oid);
        this.setName(name);
        this.setPetList(petList);
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "Oid='" + Oid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
