package com.ssd.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.spring.empapp.model.Emp;
import com.ssd.spring.empapp.s.ServiceI.EmployeeServiceInterface;
@RestController
@RequestMapping("/emp")
public class Raju {

    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @PostMapping("/saveEmp")
    public Emp saveEmp(@RequestBody Emp emp) {
        Emp emp1= employeeServiceInterface.createEmp(emp);
        return emp1;

    }

    @GetMapping("/getemployees")
    public List<Emp>getAllEmployees(){


        //sdjfbkjasdbfjlasdnlkasndvklnaslkdvn
        //mdsfnvbkasdvb
        //sdjkbksjdbvjksbdv
        //asjdvbkjasdbvjsdjvk
        return employeeServiceInterface.getAllEmp();
        //sdkjgkjasdvbjkzdbvjk
        //asdkjvbhjasdvbkjsdvbk
    }

}
