package com.example.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Designation;
import com.example.repository.DesgRepo;

@Service
public class DesigServiceImp {
	
	@Autowired
	private DesgRepo desgrepo;

	
	public Designation saveAllDesig(Designation designation) {
		 return desgrepo.save(designation);
		
	
	}

//	@Override
//	public void updateDesgname(Designation designation) {
//	
//		Designation desg=desgrepo.findById(designation.getId()).get();
//		designation.setDesgname(designation.getDesgname());
//	}

}
