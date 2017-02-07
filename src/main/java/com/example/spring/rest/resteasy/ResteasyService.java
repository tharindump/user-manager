package com.example.spring.rest.resteasy;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/manage")
@Component
public class ResteasyService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployee(@PathParam("id") String id) {
		Map<String, String> map = employeeRepo.getEmpDetails(id);
		
		return Response.ok().entity(map).build();
	}
	
}
