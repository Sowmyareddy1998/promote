package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PromoteEmp {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private int id;
	//private String desgname;
	private String empname;


   
	@ManyToOne
	@JoinColumn(name="promoteemp_id", unique = true,updatable = true)
	private PromoteEmp promoteemp;
	
	
  @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
  @JoinColumn(name="Desg_fk")
  private Designation designation;
	
	

}
