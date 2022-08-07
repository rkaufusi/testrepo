package com.rkaufusi.timeclockfullstack.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Shift {
    @Id
    @GeneratedValue
    private int sid;
    private LocalDate date;
    private LocalTime shift_start;
    private LocalTime break_start;
    private LocalTime break_end;
    private LocalTime lunch_start;
    private LocalTime lunch_end;
    private LocalTime shift_end;



    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "u_fk")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = sid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getShift_start() {
        return shift_start;
    }

    public void setShift_start(LocalTime shift_start) {
        this.shift_start = shift_start;
    }

    public LocalTime getBreak_start() {
        return break_start;
    }

    public void setBreak_start(LocalTime break_start) {
        this.break_start = break_start;
    }

    public LocalTime getBreak_end() {
        return break_end;
    }

    public void setBreak_end(LocalTime break_end) {
        this.break_end = break_end;
    }

    public LocalTime getLunch_start() {
        return lunch_start;
    }

    public void setLunch_start(LocalTime lunch_start) {
        this.lunch_start = lunch_start;
    }

    public LocalTime getLunch_end() {
        return lunch_end;
    }

    public void setLunch_end(LocalTime lunch_end) {
        this.lunch_end = lunch_end;
    }

    public LocalTime getShift_end() {
        return shift_end;
    }

    public void setShift_end(LocalTime shift_end) {
        this.shift_end = shift_end;
    }
}
