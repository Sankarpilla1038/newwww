package com.ssd.spring.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssd.spring.empapp.spring.Entity.EmpEntity;
@Repository
public interface EmpRepository extends JpaRepository<EmpEntity,Long>{


}
