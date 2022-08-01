package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Designation;
import com.example.entity.PromoteEmp;
import com.example.repository.DesgRepo;
import com.example.repository.PromoteEmpRepo;

import com.example.serviceImp.DesigServiceImp;
import com.example.serviceImp.PromoteEmpServiceImp;

@RestController
public class PromoteController {

	@Autowired
	private DesgRepo desgrepo;

	@Autowired
	private PromoteEmpServiceImp promoteEmpServiceImp;

	@Autowired
	private PromoteEmpRepo promoteemprepo;

	@Autowired
	private DesigServiceImp desigServiceImp;

//	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmp(@RequestBody Designation designation) {
		// System.out.println(designation.);

		desigServiceImp.saveAllDesig(designation);
		return new ResponseEntity<String>("emp data saved successfully", HttpStatus.CREATED);
	}

//	@PutMapping("/update")
//	public ResponseEntity<String> update(@RequestBody Designation designation) {
//		desgservice.saveAllDesig(designation);
//		return new ResponseEntity<String>("emp data update successfully", HttpStatus.CREATED);
//	}
//	

//	@PutMapping("/update/{desg_id}")
//	
//	public ResponseEntity<String> saveEmp(@RequestBody PromoteEmp promoteemp,@PathVariable int desg_id) {
//
//		promoteEmpServiceImp.saveEmp(promoteemp, desg_id);
//		
//			return new ResponseEntity<String>("added ",HttpStatus.CREATED );
//	
//	}

	@PostMapping("/addingemp/{desg_id}")
	public ResponseEntity<String> saveEmp(@RequestBody PromoteEmp promoteemp,
			@PathVariable("desg_id") Designation designation) {

		promoteemp.setDesignation(designation);
		promoteEmpServiceImp.saveEmp(promoteemp);

		return new ResponseEntity<String>("added ", HttpStatus.CREATED);
	}

//@PutMapping("/update/{desg_id}")
//public  ResponseEntity<String>  promoteEmp(@RequestBody PromoteEmp promoteemp,@PathVariable ("desg_id") int designation ){
//	PromoteEmp Exist=promoteemprepo.findById(designation).get();
//	//promote.setEmpname(promoteemp.getEmpname());
//    //promote.setDesignation(designation);
//	Exist.setDesignation(promoteemp);
//	
//	
//	promoteEmpServiceImp.saveEmp(promoteemp);
//	
//	return new ResponseEntity<String>("added ",HttpStatus.CREATED );
//}
@PutMapping("/update/{emp_id}/{sub_id}")
public  ResponseEntity<String>  promoteEmp(@RequestBody Designation designation,@PathVariable ("emp_id") int emp,@PathVariable("sub_id") int sub_id){
	PromoteEmp Exist=promoteemprepo.findById(emp).get();
	
	Exist.setPromoteemp(Exist);
	Exist.setDesignation(designation);
	PromoteEmp Exist1=promoteemprepo.findById(sub_id).get();
	
	Exist.setPromoteemp(Exist1);
	
	promoteemprepo.save(Exist);
	
	return new ResponseEntity<String>("updated ",HttpStatus.CREATED );
}
	
	
	@GetMapping("/updateEmployee/{id}/{id2}")///{id2}
	public String update(@PathVariable int id,@PathVariable int id2)//,@PathVariable int id2
	{
		
		Optional<PromoteEmp> a=promoteemprepo.findByid(id);
		
		System.out.println(a);
		
		PromoteEmp r=a.get();
		
	
		
		
		Optional<PromoteEmp> a3=promoteemprepo.findByid(id2);
		
		
		
		PromoteEmp r1=a3.get();
		
		
		
		
		r.setPromoteemp(r1);
		
		
		
		
		promoteemprepo.save(r);
		
		
		
		
		return "updated";
		
		//return "success";
	}
	
	
	
	

}
