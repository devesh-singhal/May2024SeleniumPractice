package SeleniumSessions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Serialization {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		User user  = new User("Devesh", 35);
		String jsonString = objectMapper.writeValueAsString(user);
     System.out.println(jsonString); 
	}

}

   class User {
	private String name;
	private int age;
	
	public User (String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
