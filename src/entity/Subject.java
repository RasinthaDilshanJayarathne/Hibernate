package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String sId;
    private String name;

    @ManyToMany(mappedBy = "subjectList")
    private List<Lectuer>lectuerList = new ArrayList();

    public Subject() {
    }

    public Subject(String sId, String name, List<Lectuer> lectuerList) {
        this.setsId(sId);
        this.setName(name);
        this.setLectuerList(lectuerList);
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lectuer> getLectuerList() {
        return lectuerList;
    }

    public void setLectuerList(List<Lectuer> lectuerList) {
        this.lectuerList = lectuerList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                ", lectuerList=" + lectuerList +
                '}';
    }
}
