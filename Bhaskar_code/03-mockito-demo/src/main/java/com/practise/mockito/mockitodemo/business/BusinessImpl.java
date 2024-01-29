package com.practise.mockito.mockitodemo.business;

public class BusinessImpl {

	private DataService service;

	public BusinessImpl(DataService service) {
		super();
		this.service = service;
	}

	public int getGreaterValueFormArray() {
		int[] result = service.retrieveData();
		int greaterValue = Integer.MIN_VALUE;
		for (int data : result) {

			if (data > greaterValue) {
				greaterValue = data;
			}
		}

		return greaterValue;
	}
}

interface DataService {

	int[] retrieveData();
}