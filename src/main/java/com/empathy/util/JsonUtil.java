package com.empathy.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	
	public static String toJson(Object value) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = null;
		try {
			json = mapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
