package com.uhg.apachecxf.rest.ws.poc;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.uhg.apachecxf.rest.ws.poc.dao.EmployeeDAO;

//@WebService(endpointInterface = "com.uhg.apachecxf.soap.ws.poc.EmployeeService", serviceName = "employeeService")
public class EmployeeServiceImpl{// implements EmployeeService {

	@POST
	@Path("/addEmployee")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json",
			"application/x-www-form-urlencoded" })
	public String insertEmployee(@BeanParam EmployeeVO employeeVO) {
		EmployeeDAO.insertEmployee(employeeVO);
		return employeeVO.getEmpName() +  " record is inserted into databse";
	}

	@GET
	@Path("/getEmployee/{empId}")
	@Produces({"application/xml" })
	public EmployeeVO getEmployee(@PathParam("empId") String empId) {
		return EmployeeDAO.getEmployee(empId);
	}
}
