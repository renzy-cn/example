package cn.renzy.example.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.renzy.example.jackson.entity.User;

public class JacksonExample {

	public static void main(String[] args) throws JsonProcessingException {
		
		JacksonExample je = new JacksonExample();
		User user = je.generateUser();
		//对象转json
		String json = je.objectToJson(user);
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		//json转对象
		User u = (User) je.jsonToObject(json, User.class);
		
		System.out.println(u);
	}
	
	
	public String objectToJson(Object o){
		
		ObjectMapper om = new ObjectMapper();
		System.out.println("对象转json	开始");
		String json;
		try {
			json = om.writeValueAsString(o);
			System.out.println("生成的Json：" + json);
			return json;
		} catch (JsonProcessingException e) {
			System.out.println("对象转json	异常");
			e.printStackTrace();
			return null;
		} finally{
			System.out.println("对象转json	结束");
		}
	}
	
	public <T>  Object jsonToObject(String json, Class<T> c){
		
		System.out.println("json转对象	开始");
		ObjectMapper om = new ObjectMapper();
		
		try {
			Object o  = om.readValue(json, c);
			return o;
		} catch (IOException e) {
			System.out.println("json转对象	异常");
			e.printStackTrace();
			return null;
		} finally{
			System.out.println("json转对象	结束");
		}
		
		
		
	}

	public User generateUser(){
		
		User user = new User();
		user.setId(1);
		user.setUname("任志远");
		List<User> relatives = new ArrayList<User>();
		for(int i = 10 ; i < 20 ; i++){
			User relative = new User();
			relative.setId(i);
			relative.setUname("任志远" + i);
			Map<String, Object> hobby = new HashMap<>();
			relative.setHobby(hobby);
			List<User> r = new ArrayList<User>();
			relative.setRelatives(r);
			relatives.add(relative);
		}
		user.setRelatives(relatives);
		
		Map<String, Object> hobbies = new HashMap<>();
		for(int j = 20; j <30 ; j++){
			hobbies.put(j+"", "aihao"+j);
		}
		user.setHobby(hobbies);
		
		return user;
	}
	
}