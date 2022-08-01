package com.example.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Designation;
import com.example.entity.PromoteEmp;
import com.example.repository.DesgRepo;
import com.example.repository.PromoteEmpRepo;

@Service
public class PromoteEmpServiceImp {
	
	@Autowired
	private PromoteEmpRepo promoteemprepo;
	
	
	@Autowired
	private DesgRepo desgrepo;

	public PromoteEmp saveEmp(PromoteEmp promoteemp) {
		
	return promoteemprepo.save(promoteemp);
		
}
	
	
//	public PromoteEmp saveEmp(PromoteEmp promoteemp, int promoteemp_id) {
//	PromoteEmp p=promoteemprepo.findById(promoteemp_id);
//	promoteemp.setPromoteemp(p);s
// 
//	 
//	PromoteEmp h=promoteemprepo.findById(promoteemp.getId()).get();
//	
//	Optional<PromoteEmp>   emp=promoteemprepo.findById(promoteemp_id);
//
//	
//	
//	
//	                                     
//	promoteemp.setPromoteemp(h);
//	
//	
//return 	promoteemprepo.save(promoteemp);
//		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

//
//	public PromoteEmp saveEmp( PromoteEmp promoteemp,int desig_id) {
//	
//	PromoteEmp promote=promoteemprepo.findById(desig_id ).get();
//		
//		System.out.println(promote);
//		Designation d=new Designation();
//		//promote.setEmpname(promoteemp.getEmpname());
//		promote.setDesignation(promoteemp.getDesignation());
//	
//		
//	
//
//        
//
//		
////     
		//return 	promoteemprepo.save(promoteemp);
		//}
		
}
	
	


