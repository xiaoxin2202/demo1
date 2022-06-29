package com.example.BTCuoiKy.controller;

import com.example.BTCuoiKy.dto.RoomDTO;
import com.example.BTCuoiKy.model.Room;
import com.example.BTCuoiKy.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private IRoomService roomService;


    //API add employee
    @PostMapping("/add")
    public RoomDTO addRoom(@RequestBody RoomDTO room){

        return roomService.addRoom(room);

    }

    //API update Employee
    @PutMapping("/update")
    public Room updateRoom(@RequestParam("id") long id, @RequestBody Room room){
        return roomService.updateRoom(id,room);
    }

    //API xoá nhân viên
    @DeleteMapping("/delete/{id}")
    public  boolean deleteRoome(@PathVariable("id") long id){
        return roomService.deleteRoom(id);
    }

    //API đưa ra tất cả nhân viên
    @GetMapping("/list")
    public List<RoomDTO> getAllRoom(){
        return roomService.getAllRoom();
    }
}
