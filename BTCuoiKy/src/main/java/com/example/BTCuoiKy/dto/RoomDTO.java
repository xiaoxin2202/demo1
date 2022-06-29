package com.example.BTCuoiKy.dto;

public class RoomDTO {

    private long id;

    private String numberRoom;

    private boolean empty;

    private String des;


    private String employeeCode;

    public RoomDTO() {
    }

    public RoomDTO(long id, String numberRoom, boolean empty, String des, String employeeCode) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.empty = empty;
        this.des = des;
        this.employeeCode = employeeCode;
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

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}