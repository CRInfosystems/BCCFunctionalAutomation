package uk.gov.bristol.registrations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum StepsContext {
	
	INSTANCE;
	
	private Map<String, Object> contextMap = new HashMap<String, Object>();
	
	public Object get(String key){
		return contextMap.get(key);
	}
	
	public void put(String key, Object value){
		contextMap.put(key, value);
	}
	
	public Set<String> keySet(){
		return contextMap.keySet();
	}
}
