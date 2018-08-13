package com.farukgenc.person.web.resources;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class SuccessAssignmentResource extends ResourceSupport {

	private List<PersonResource> personResourceList;

	public List<PersonResource> getPersonResourceList() {
		return personResourceList;
	}

	public void setPersonResourceList(List<PersonResource> personResourceList) {
		this.personResourceList = personResourceList;
	}

}
