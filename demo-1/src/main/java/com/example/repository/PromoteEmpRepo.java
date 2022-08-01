package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PromoteEmp;
@Repository
public interface PromoteEmpRepo extends JpaRepository<PromoteEmp,Integer> {
	
	
	Optional<PromoteEmp>findByid(int id);
	

//	void save(PromoteEmp exist, int promoteemp_id);
//
//	//void save(PromoteEmp exist, int promoteemp_id);
//
//	//boolean existsByDesgname(String desgname);
//	//public   void findByDesgname(String desgname);

}
