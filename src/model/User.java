package model;
public class User {
	private String userName;
	private String password;
	private int age;
	 private String categoria = "NEWIE";
	
	
	public User (String userName, String password, int age, String userCategory) {
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.userCategory = userCategory; 
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
	
	public String getUserCategory() {
		return userCategory;
	}
	
	public void setUserCategory (String userCategory) {
		this.userCategory = userCategory;
	}
	
	public void ElecCategory() {
        category op1 = category.Cat1;
        category op2 = category.Cat2;
        category op3 = category.Cat3;
        category op4 = category.Cat4;

        if (op1.getNum() == 0 && op1.getNum() < 3) {
            this.getCategoria();
        } else if (op2.getNum() >= 3 && op2.getNum() < 10) {
            this.getCategoria();
        } else if (op3.getNum() >= 10 && op3.getNum() < 30) {
            this.getCategoria();
        } else if (op4.getNum() >= 30) {
            this.getCategory();
        }

    }

    public String topString() {

        System.out.println("-------------------User-----------------------");
        return ("Name:" + this.name
                + "\nPasswors:" + this.password
                + "\nAge:" + this.age
                + "\nCategory:" + this.getCategory());
    }
	

}
	
	
	
	
	
	