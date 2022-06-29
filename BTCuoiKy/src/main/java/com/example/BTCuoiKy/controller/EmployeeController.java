package com.example.BTCuoiKy.controller;


import com.example.BTCuoiKy.dto.EmployeeDTO;
import com.example.BTCuoiKy.model.Employee;
import com.example.BTCuoiKy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    //API Test
    @GetMapping("/test")
    public String test(){
        return "index";
    }

    //API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) throws IOException,ParseException  {

      return employeeService.addEmployee(employee);

    }

    //API update Employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    //API xoá nhân viên
    @DeleteMapping("/delete/{id}")
    public  boolean deleteEmployee(@PathVariable("id") long id){
        return employeeService.deleteEmployee(id);
    }

    //API đưa ra tất cả nhân viên
    @GetMapping("/list")
    public List<EmployeeDTO>getAllEmployee(){
        return employeeService.getAllEmploy();
    }

    //API đưa ra 1 nhân viên bất kì
    @GetMapping("/get/{id}")
    public Employee getOneEmployee(@PathVariable("id") long id){
        return employeeService.getOneEmployee(id);
    }

    //API so sánh 2 mã code
    @PutMapping("/equails")
    public boolean equailTwoCode(@RequestParam("id") long id, @RequestBody Employee employee){
        return employeeService.equailTwoCode(id,employee);
    }


}
