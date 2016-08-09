package cn.renzy.example.jackson.entity;

import java.util.List;
import java.util.Map;

public class User {

	private long id;
	
	private String uname;
	
	private List<User> relatives;
	
	private Map<String, Object> hobby;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<User> getRelatives() {
		return relatives;
	}

	public void setRelatives(List<User> relatives) {
		this.relatives = relatives;
	}

	public Map<String, Object> getHobby() {
		return hobby;
	}

	public void setHobby(Map<String, Object> hobby) {
		this.hobby = hobby;
	}
	
}
