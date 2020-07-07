package com.empathy.types;

import com.fasterxml.jackson.annotation.JsonValue;



public enum IssueType {
	
	
	USERSTORY("UserStory"),
	TASK("Task"),
	SUBTASK("SubTask"),
	IMPEDIMENT("Impediment"),
	BUG("Bug");
	
	private final String value;

    private IssueType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
   

}
