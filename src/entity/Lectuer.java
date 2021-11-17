package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lectuer {
    @Id
    private String lId;
    private String name;

    @ManyToMany
    private List<Subject>subjectList = new ArrayList();

    public Lectuer() {
    }

    public Lectuer(String lId, String name, List<Subject> subjectList) {
        this.setlId(lId);
        this.setName(name);
        this.setSubjectList(subjectList);
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lectuer{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
