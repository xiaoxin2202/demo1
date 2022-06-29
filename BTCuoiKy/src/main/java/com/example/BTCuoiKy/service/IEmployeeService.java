package com.example.BTCuoiKy.service;

import com.example.BTCuoiKy.dto.EmployeeDTO;
import com.example.BTCuoiKy.model.Employee;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface IEmployeeService {
    //Ham them nhan vien
    public Employee addEmployee(Employee employee) throws IOException, ParseException;

    //Hàm chỉnh sửa thông tin nhân viên
    public Employee updateEmployee(long id, Employee employee);

    //Hàm xoá nhân viên
    public boolean deleteEmployee(long id);

    //Hàm lấy ra danh sách nhân viên
    public List<EmployeeDTO> getAllEmploy();

    //Hàm lấy ra môtn nhân viên
    public Employee getOneEmployee(long id);

    //Hàm so sánh mã code gửi mail của mail client và trên hệ thông
    public boolean equailTwoCode(long id, Employee employee);

}
