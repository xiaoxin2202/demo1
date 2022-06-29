package com.example.BTCuoiKy.model;

import com.example.BTCuoiKy.utils.DateTinh;
import com.example.BTCuoiKy.utils.RandomUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "name")
    private String name;
    @Column(name= "address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="dateIn")
    private String dateIn;
    @Column(name="dateOut")
    private String dateOut;

    @OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL)
    private List<Room> rooms = new ArrayList<>();
    @Column(name="total")
    private long total;

    @Column(name="codeHT")
    private  String codeHT;
    @Column(name="codeKH")
    private  String codeKH;




    public Employee() {
    }

    public Employee(String name, String address, String email, String dateIn, String dateOut, List<Room> rooms, long total,  String codeHT, String codeKH) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.rooms = rooms;
        this.total = total;

        this.codeHT = codeHT;
        this.codeKH = codeKH;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodeHT() {
        return codeHT;
    }

    public void setCodeHT(String codeHT) {
        this.codeHT = RandomUtils.generateTempPwd(6);
    }

    public String getCodeKH() {
        return codeKH;
    }

    public void setCodeKH(String codeKH) {
        this.codeKH = codeKH;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
