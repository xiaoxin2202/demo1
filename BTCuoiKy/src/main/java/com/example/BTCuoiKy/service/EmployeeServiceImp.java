package com.example.BTCuoiKy.service;


import com.example.BTCuoiKy.converter.EmployeeConverter;
import com.example.BTCuoiKy.dto.EmployeeDTO;
import com.example.BTCuoiKy.model.Employee;
import com.example.BTCuoiKy.model.Room;
import com.example.BTCuoiKy.repository.EmployeeRepository;

import com.example.BTCuoiKy.repository.RoomRepository;
import com.example.BTCuoiKy.utils.DateTinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class EmployeeServiceImp  implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private EmployeeConverter employeeConverter;

    @Autowired
    private EmailSenderSerive emailSenderSerive;

    @Override
    public boolean equailTwoCode(long id, Employee employee) {
        if(id>=1 &&employee!=null){
            Employee employee1= employeeRepository.getById(id);
            if(employee1!=null){
                employee1.setCodeKH(employee.getCodeKH());
                if(employee1.getCodeHT().equals(employee1.getCodeKH())){
                    List<Room> dsroom=new ArrayList<>();

                    dsroom=employee1.getRooms();
                    for(Room item:dsroom){
                        item.setEmpty(true);
                    }
                    employeeRepository.save(employee1);
                }

                return true;
            }
        }
        return false;
    }

//    @Override
//    public boolean calculate(long id) {
//        if(id>=1){
//            Employee employee1=employeeRepository.getById(id);
//            if(employee1!=null){
//
//                String a=employee1.getDateIn();
//                System.out.println(a );
//                String b=employee1.getDateOut();
//                System.out.println(b );
//
//                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
//                try {
//                    a=sdf.format(a);
//                    b=sdf.format(b);
//                    Date c=sdf.parse(a);
//                    Date d=sdf.parse(b);
//                    long diff = ((Date) d).getTime() - ((Date) c).getTime();
//
//                    TimeUnit time = TimeUnit.DAYS;
//                    long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
//                    long ngay;
//                    //xét ngoại lệ khi ngày gửi và trả trong cùng 1 ngày
//                    if (diffrence == 0) {
//                        ngay = 1;
//                    } else {
//                        ngay = diffrence;
//                    }
//
//                    long tien=ngay*120000;
//                    employee1.setTotal(tien);
//                    return true;
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//        }
//
//        }
//        return false;
//    }

    @Override
    public Employee addEmployee(Employee employee) throws IOException,ParseException   {
        if(employee!=null){
            //emailSenderSerive.sendSimpleEmail(employee.getEmail(),"Mã xác thực của bạn: ","MÃ XÁC THỰC CỦA BẠN LÀ:"+employee.getCodeHT());
            long s=Long.parseLong(DateTinh.Tinh(employee.getDateIn(),employee.getDateOut()));
            employee.setTotal(s);
            return employeeRepository.save(employee);
        }
        return null;


    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        if(employee!=null){
            Employee employee1= employeeRepository.getById(id);
            if(employee1!=null){
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());
                employee1.setEmail(employee.getEmail());
                employee1.setDateIn(employee.getDateIn());
                employee1.setDateOut(employee.getDateOut());


                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if(id>=1){
            Employee employee= employeeRepository.getById(id);
            if(employee!=null){
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<EmployeeDTO> getAllEmploy() {

        List<EmployeeDTO>ds=new ArrayList<>();
        List<Employee> entities = employeeRepository.findAll();
        for (Employee item: entities) {
            EmployeeDTO employeeDTO = employeeConverter.toDTO(item);
            ds.add(employeeDTO);
        }
        return ds;
    }

    @Override
    public Employee getOneEmployee(long id) {

        return null;
    }
}
