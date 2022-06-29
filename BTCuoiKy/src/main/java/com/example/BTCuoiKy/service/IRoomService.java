package com.example.BTCuoiKy.service;

import com.example.BTCuoiKy.dto.RoomDTO;
import com.example.BTCuoiKy.model.Room;

import java.util.List;

public interface IRoomService {
    public RoomDTO addRoom(RoomDTO roomDTO);

    //Hàm chỉnh sửa thông tin nhân viên
    public Room updateRoom(long id, Room room);

    //Hàm xoá nhân viên
    public boolean deleteRoom(long id);

    //Hàm lấy ra danh sách nhân viên
    public List<RoomDTO> getAllRoom();

    //Hàm lấy ra môtn nhân viên
    public Room getOneRoom(long id, Room room);


}
