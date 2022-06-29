package com.example.BTCuoiKy.converter;

import com.example.BTCuoiKy.dto.RoomDTO;
import com.example.BTCuoiKy.model.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
    public Room toEntity(RoomDTO dto) {
        Room entity = new Room();
        entity.setNumberRoom(dto.getNumberRoom());
        entity.setEmpty(dto.isEmpty());
        entity.setDes(dto.getDes());

        return entity;
    }

    public RoomDTO toDTO(Room entity) {
        RoomDTO dto = new RoomDTO();
        if (entity.getId() >=1) {
            dto.setId(entity.getId());
        }
        dto.setNumberRoom(entity.getNumberRoom());
        dto.setEmpty(entity.isEmpty());
        dto.setDes(entity.getDes());

        return dto;
    }
    public Room toEntity(RoomDTO dto,Room entity) {

        entity.setNumberRoom(dto.getNumberRoom());
        entity.setEmpty(dto.isEmpty());
        entity.setDes(dto.getDes());

        return entity;
    }
}
