package com.example.BTCuoiKy.converter;


import com.example.BTCuoiKy.dto.EmployeeDTO;
import com.example.BTCuoiKy.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter {
    public Employee toEntity(EmployeeDTO dto) {
        Employee entity = new Employee();
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());
        entity.setDateIn(dto.getDateIn());
        entity.setDateOut(dto.getDateOut());
        entity.setCodeHT(dto.getCodeHT());
        entity.setCodeKH(dto.getCodeKH());
        entity.setTotal(dto.getTotal());

        return entity;
    }

    public EmployeeDTO toDTO(Employee entity) {
        EmployeeDTO dto = new EmployeeDTO();
        if (entity.getId() >=1) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setEmail(entity.getEmail());
        dto.setDateIn(entity.getDateIn());
        dto.setDateOut(entity.getDateOut());
        dto.setCodeHT(entity.getCodeHT());
        dto.setCodeKH(entity.getCodeKH());
        dto.setTotal(entity.getTotal());

        return dto;
    }

    public Employee toEntity(EmployeeDTO dto, Employee entity) {

        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());
        entity.setDateIn(dto.getDateIn());
        entity.setDateOut(dto.getDateOut());
        entity.setCodeHT(dto.getCodeHT());
        entity.setCodeKH(dto.getCodeKH());

        return entity;
    }
}
