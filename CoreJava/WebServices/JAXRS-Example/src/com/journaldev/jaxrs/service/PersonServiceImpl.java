package com.journaldev.jaxrs.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.journaldev.jaxrs.model.Person;
import com.journaldev.jaxrs.model.Response;

/**
 * @author Robin
 * Restful Web Services
 *	Restful Web Services is a stateless client-server architecture where web services are resources 
 *	and can be identified by their URIs.

 * Java RESTful Web Services API
 * 	Java API for RESTful Web Services (JAX-RS) is the Java API for creating REST web services. 
 * 	JAX-RS uses annotations to simplify the development and deployment of web services. 
 *	JAX-RS is part of JDK, so you don�t need to include anything to use it�s annotations.

 * Restful Web Services Annotations
 *	Some of the important JAX-RS annotations are:
 *	> @Path: used to specify the relative path of class and methods. We can get the URI of a webservice by scanning the Path annotation value.
 *	> @GET, @PUT, @POST, @DELETE and @HEAD: used to specify the HTTP request type for a method.
 *	> @Produces, @Consumes: used to specify the request and response types.
 *	> @PathParam: used to bind the method parameter to path value by parsing it.
 *
 */
@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@Override
	@POST
    @Path("/add")
	public Response addPerson(Person p) {
		Response response = new Response();
		if(persons.get(p.getId()) != null){
			response.setStatus(false);
			response.setMessage("Person Already Exists");
			return response;
		}
		persons.put(p.getId(), p);
		response.setStatus(true);
		response.setMessage("Person created successfully");
		return response;
	}

	@Override
	@GET
    @Path("/{id}/delete")
	public Response deletePerson(@PathParam("id") int id) {
		Response response = new Response();
		if(persons.get(id) == null){
			response.setStatus(false);
			response.setMessage("Person Doesn't Exists");
			return response;
		}
		persons.remove(id);
		response.setStatus(true);
		response.setMessage("Person deleted successfully");
		return response;
	}

	@Override
	@GET
	@Path("/{id}/get")
	public Person getPerson(@PathParam("id") int id) {
		return persons.get(id);
	}
	
	@GET
	@Path("/{id}/getDummy")
	public Person getDummyPerson(@PathParam("id") int id) {
		Person p = new Person();
		p.setAge(99);
		p.setName("Dummy");
		p.setId(id);
		return p;
	}

	@Override
	@GET
	@Path("/getAll")
	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

}