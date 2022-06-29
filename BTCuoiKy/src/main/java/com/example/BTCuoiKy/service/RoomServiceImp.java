package com.example.BTCuoiKy.service;

import com.example.BTCuoiKy.converter.RoomConverter;
import com.example.BTCuoiKy.dto.RoomDTO;
import com.example.BTCuoiKy.model.Employee;
import com.example.BTCuoiKy.model.Room;
import com.example.BTCuoiKy.repository.EmployeeRepository;
import com.example.BTCuoiKy.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class RoomServiceImp implements IRoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoomConverter roomConverter;
    @Override
    public RoomDTO addRoom(RoomDTO roomDTO) {
        Room room=new Room();
        room=roomConverter.toEntity(roomDTO);
        //Employee employee = employeeRepository.findOneByCode(roomDTO.getEmployeeCode());
        Employee employee=employeeRepository.findOneById(Long.parseLong(roomDTO.getEmployeeCode()));
        room.setEmployee(employee);
        room=roomRepository.save(room);
        return roomConverter.toDTO(room);


    }

    @Override
    public Room updateRoom(long id, Room room) {
        if(room!=null){
            Room room1= roomRepository.getById(id);
            if(room1!=null){
                room1.setNumberRoom(room.getNumberRoom());
                room1.setDes(room.getDes());
                room1.setEmployee(room.getEmployee());

                return roomRepository.save(room1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteRoom(long id) {
        if(id>=1){
            Room employee= roomRepository.getById(id);
            if(employee!=null){
                roomRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<RoomDTO> getAllRoom() {
        List<RoomDTO>ds=new ArrayList<>();
        List<Room> entities = roomRepository.findAll();
        for (Room item: entities) {
            RoomDTO roomDTO = roomConverter.toDTO(item);
            ds.add(roomDTO);
        }
        return ds;

    }

    @Override
    public Room getOneRoom(long id, Room room) {
        return null;
    }
}
