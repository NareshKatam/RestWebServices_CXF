package com.uhg.apachecxf.rest.ws.poc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmployeeService {
	@WebMethod
	public String insertEmployee(EmployeeVO employeeVO);

	@WebMethod
	public EmployeeVO getEmployee(String id);
}
