package com.ssd.spring.empapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.spring.empapp.model.Emp;
import com.ssd.spring.empapp.repository.EmpRepository;
import com.ssd.spring.empapp.s.ServiceI.EmployeeServiceInterface;
import com.ssd.spring.empapp.spring.Entity.EmpEntity;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {
	
	@Autowired 
	private EmpRepository empRepo;
	@Autowired
	private ModelMapper model;
	
	

	@Override
	public Emp createEmp(Emp emp) {
		
		EmpEntity empEntity=model.map(emp, EmpEntity.class);
		
		EmpEntity entityEmp=empRepo.save(empEntity);
		
		Emp emp1=model.map(entityEmp, Emp.class);
		
		return emp1;
	}

	@Override
	public List<Emp> getAllEmp() {
		List<EmpEntity> listEmpEntity=empRepo.findAll();
		List<Emp>modelemp= new ArrayList<Emp>();
		
		for(EmpEntity emp:listEmpEntity) {
			Emp modelemp1=model.map(emp, Emp.class);
			modelemp.add(modelemp1);
			
		}
		System.out.println(modelemp);
		return modelemp;
	}

	@Override
	public List<Emp> updateById(Emp emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> deleteById(Long empno) {
		// TODO Auto-generated method stub
		return null;
	}

}
