package com.rkaufusi.timeclockfullstack.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;

    @OneToMany(targetEntity = Shift.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "u_fk", referencedColumnName = "id")
    private List<Shift> shift;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Shift> getShift() {
        return shift;
    }

    public void setShift(List<Shift> shift) {
        this.shift = shift;
    }
}
