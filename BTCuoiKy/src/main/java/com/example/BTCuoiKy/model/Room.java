package com.example.BTCuoiKy.model;

import javax.persistence.*;

@Entity
@Table(name= "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "numberRoom")
    private String numberRoom;
    @Column(name= "empty")
    private boolean empty;
    @Column(name= "des")
    private String des;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Room() {
    }

    public Room(String numberRoom, boolean empty, String des) {
        this.numberRoom = numberRoom;
        this.empty = empty;
        this.des = des;
    }

    public Employee getEmployee() {
        return employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
