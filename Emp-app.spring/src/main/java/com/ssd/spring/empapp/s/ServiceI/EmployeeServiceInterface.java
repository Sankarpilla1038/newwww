package com.ssd.spring.empapp.s.ServiceI;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssd.spring.empapp.model.Emp;

@Service
public interface EmployeeServiceInterface {
	
	Emp createEmp(Emp emp);
	List<Emp>getAllEmp();
	List<Emp>updateById(Emp emp);
	List<Emp>deleteById(Long empno);
	
	
	
	
	 

}
