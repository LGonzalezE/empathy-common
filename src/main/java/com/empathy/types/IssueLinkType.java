package com.empathy.types;

import com.fasterxml.jackson.annotation.JsonValue;



public enum IssueLinkType {
	
	
	ISBLOCKEDBY("IsBlockedBy"),
	ISCAUSEDBY("IsCausedBy");
	
	private final String value;

    private IssueLinkType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
   

}
