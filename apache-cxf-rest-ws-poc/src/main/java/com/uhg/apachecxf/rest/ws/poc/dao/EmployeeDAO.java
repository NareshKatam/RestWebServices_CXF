package com.uhg.apachecxf.rest.ws.poc.dao;

import java.util.HashMap;
import java.util.Map;

import com.uhg.apachecxf.rest.ws.poc.EmployeeVO;

public class EmployeeDAO {
	private static Map<String, EmployeeVO> emp = new HashMap<String, EmployeeVO>();
	/*static void loadEmployee(){
		EmployeeVO employee = new EmployeeVO();
		employee.setEmpId("123456");
		employee.setEmpName("Test Employee");
		employee.setDesg("PL");
		employee.setRole("Tech Lead");
		emp.put(employee.getEmpId(), employee);
	}*/
	public static void insertEmployee(EmployeeVO employeeVO) {
		emp.put(employeeVO.getEmpId(), employeeVO);
	}

	public static EmployeeVO getEmployee(String empId) {
		EmployeeVO employee = null;
		employee = emp.get(empId);
		if(null == employee){
			employee = new EmployeeVO();
			employee.setEmpId("123456");
			employee.setEmpName("Test Employee");
			employee.setDesg("PL");
			employee.setRole("Tech Lead");
		}
		return employee;
	}

}
