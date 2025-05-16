package com.ssd.spring.empapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
	private Long empno;
	private String ename;
	private String job;
	private Integer mgr;
	private String hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	
	

	
	
	
	

}
