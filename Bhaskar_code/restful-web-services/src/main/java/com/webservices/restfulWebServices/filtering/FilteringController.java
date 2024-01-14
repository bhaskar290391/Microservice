package com.webservices.restfulWebServices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping(path = "/static-filtering", produces = { "application/json" })
	public MappingJacksonValue getFilterUser() {

		FilterUser bean = new FilterUser("value1", "value2", "value3");
		MappingJacksonValue value = new MappingJacksonValue(bean);
		SimpleBeanPropertyFilter beanFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", beanFilter);
		value.setFilters(filters);

		return value;
	}

	@GetMapping(path = "/static-filtering-list", produces = { "application/json" })
	public MappingJacksonValue getFilterUserList() {
		List<FilterUser> asList = Arrays.asList(new FilterUser("value1", "value2", "value3"),
				new FilterUser("value4", "value5", "value6"));
		
		MappingJacksonValue value = new MappingJacksonValue(asList);
		SimpleBeanPropertyFilter beanFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", beanFilter);
		value.setFilters(filters);
		return value;
	}

	private void filtersMethod(FilterUser bean,String field1,String field2) {
		
	}
}
