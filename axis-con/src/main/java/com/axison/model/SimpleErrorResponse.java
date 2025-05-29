package com.axison.model;

import java.util.List;

public class SimpleErrorResponse {
	 private String message;
	    private List<String> errors;

	    public SimpleErrorResponse(String message, List<String> errors) {
	        this.message = message;
	        this.errors = errors;
	    }

}
