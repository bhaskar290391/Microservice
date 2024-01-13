package com.webservices.restfulWebServices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	@GetMapping(path = "/v1/person", produces = { "application/json" })
	public PersonV1 getPersonV1() {
		return new PersonV1("Bhaskar");
	}

	@GetMapping(path = "/v2/person", produces = { "application/json" })
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Bhaskar", "bhaskar"));
	}

	// request param versioning
	@GetMapping(path = "/person", params = "version=1", produces = { "application/json" })
	public PersonV1 getPersonRequestParam() {
		return new PersonV1("Bhaskar");
	}

	@GetMapping(path = "/person", params = "version=2", produces = { "application/json" })
	public PersonV2 getPersonRequestParam2() {
		return new PersonV2(new Name("Bhaskar", "bhaskar"));
	}

	// accept header versioning

	@GetMapping(path = "/person", headers = "version=1", produces = { "application/json" })
	public PersonV1 getPersonheader1() {
		return new PersonV1("Bhaskar");
	}

	@GetMapping(path = "/person", headers = "version=2", produces = { "application/json" })
	public PersonV2 getPersonheader12() {
		return new PersonV2(new Name("Bhaskar", "bhaskar"));
	}
	
	
	
	//Mime type versioning
	

	@GetMapping(path = "/person", produces = { "application/vnd.company.app-v1+json" })
	public PersonV1 getPersonMime1() {
		return new PersonV1("Bhaskar");
	}
	
	@GetMapping(path = "/person", produces = { "application/vnd.company.app-v2+json" })
	public PersonV2 getPersonMime12() {
		return new PersonV2(new Name("Bhaskar", "bhaskar"));
	}

//	@GetMapping(path = "/persons" produces = { "application/json-v2+test2;" })
//	public PersonV2 getPersonMime2() {
//		return new PersonV2(new Name("Bhaskar", "bhaskar"));
//	}
	
	
	
	

}
