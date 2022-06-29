package com.example.BTCuoiKy.dto;

public class EmployeeDTO {
    private long id;

    private String name;

    private String address;

    private String email;

    private String dateIn;

    private String dateOut;

    private long total;

    private  String codeHT;

    private  String codeKH;

    public EmployeeDTO(long id, String name, String address, String email, String dateIn, String dateOut, long total, String codeHT, String codeKH) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.total = total;
        this.codeHT = codeHT;
        this.codeKH = codeKH;
    }

    public EmployeeDTO() {
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

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getCodeHT() {
        return codeHT;
    }

    public void setCodeHT(String codeHT) {
        this.codeHT = codeHT;
    }

    public String getCodeKH() {
        return codeKH;
    }

    public void setCodeKH(String codeKH) {
        this.codeKH = codeKH;
    }
}
