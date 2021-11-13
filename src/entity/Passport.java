package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
    @Id
    private String psId;
    private double fee;

    @OneToOne
    private  Person person;

    public Passport() {
    }

    public Passport(String psId, double fee) {
        this.setPsId(psId);
        this.setFee(fee);
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "psId='" + psId + '\'' +
                ", fee=" + fee +
                '}';
    }
}
