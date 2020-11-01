package model;
public class User {
	private String userName;
	private String password;
	private int age;
	private Category category;
	
	
	public User (String userName, String password;, int age, Category category) {
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.category = category; 
	}
	
	public String getuserName() {
		return userName;
	}
	
	public void setuserName (String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return name;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public int getAge(){
		return age;
	}
	
	public void increaseAge (int age) {
		this.age = age;
	}
}
	
	
	