package com.empathy.types;

import com.fasterxml.jackson.annotation.JsonValue;



public enum IssueStatus {
	
	
	TODO("ToDo"),
	DOING("Doing"),
	DONE("Done"),
	BLOCKED("Blocked"),
	ABORTED("Aborted");
	
	private final String value;

    private IssueStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
   

}
