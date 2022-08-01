package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Designation;
@Repository
public interface DesgRepo extends JpaRepository<Designation,Integer> {
 public boolean existsByDesgname(String desgname);

public Designation findById(String desgname);
//public   Designation findByDesgname(String desgname);


}
