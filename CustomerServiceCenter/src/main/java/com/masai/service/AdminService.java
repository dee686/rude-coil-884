package com.masai.service;

import java.util.List;

import com.masai.exception.DepartmentException;
import com.masai.exception.OperatorException;
import com.masai.exception.ProblemException;
import com.masai.model.Department;
import com.masai.model.Operator;

public interface AdminService {

	
	public String createDepartment(Department department)throws DepartmentException;
	
	
	////IMP
	public String deleteDepartment(Integer departmentId)throws DepartmentException;
	
	
	
	
	
	
	
	//setter getter 
	public String updateDepartment(Department department)throws DepartmentException;
	
	
	
	public Department findDepartmentById(Department department)throws DepartmentException;
	
	
	public List<Department> findAllDepartment() throws DepartmentException;
	
	
	
	public String createOperator(Integer departmentID,Operator operator)throws OperatorException;
	
	
	
	public String deleteOperator(Integer operatorId) throws OperatorException;
	
	public String updateOperator(Operator operator)throws OperatorException;
	
	public List<Operator> findAllOperator() throws OperatorException;
	
	public Operator findOperator(Integer operatorId)throws OperatorException;
	
	
	
	
	public String assign_Problem_To_Operator(Integer problemId,Integer operatorId)throws ProblemException,OperatorException;
	
	
	
	
	
	
	
	
	
}
