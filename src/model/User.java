package model;
public class User {
	private String userName;
	private int password;
	private int age;
	private Category userCategory;
	 
	 
	  //Array of ten users max
    private final static int SIZE_USER = 10;
    public User[] userZ;
	
	
	public User (String userName, int password, int age) {
		this.userName = userName;
		this.password = password;
		this.age = age;
		userCategory = userCategory.NEWBIE;
        userZ = new User[SIZE_USER];

	}
	public void newbie() {
        userCategory = Category.NEWBIE;
    }

    public void little_contributor() {
		userCategory = Category.LITTLE_CONTRIBUTOR;
    }

    public void mild_contributor() {
        userCategory = Category.MILD_CONTRIBUTOR;
    }

    public void star_contributor() {
        userCategory = Category.STAR_CONTRIBUTOR;
    }

	/**
		*This method saves the username of the users.
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> Their username have been saved.
		*/

	public String getUserName() {
		return userName;
	}
	/**
		*This method change their username
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> Their new username have been saved.
		*@param userName it is the name of the user in the app. userName != null
		*/
	public void setUserName (String userName) {
		this.userName = userName;
	}
	
		/**
		*This method saves the password of the users.
		*<b>pre: </b> The user has to enter an int.
		*<b>post: </b> Their password have been saved.
		*/
	public int getPassword() {
		return password;
	}
	/**
		*This method change their password
		*<b>pre: </b> The user has to enter a int.
		*<b>post: </b> Their new password have been saved.
		*@param password it is the password of the user in the app. password != null
		*/
	public void setPassword (int password) {
		this.password = password;
	}
	/**
		*This method saves the age of the users.
		*<b>pre: </b> The user has to enter an int.
		*<b>post: </b> Their age have been saved.
		*/
	public int getAge(){
		return age;
	}
	/**
		*This method change their age
		*<b>pre: </b> The user has to enter a int.
		*<b>post: </b> Their age have been uptated.
		*@param age it is the age of the user in the app. age != null
		*/
	public void increaseAge (int age) {
		this.age = age;
	}
	
	/**
		*This method saves the category of the users.
		*<b>post: </b> Their category start with Newbie.
		*/
	
	public Category getUserCategory() {
		return userCategory;
	}
	/**
		*This method change their category
		*<b>pre: </b> The user has to add songs
		*<b>post: </b> Their category have been uptated according to the numbers of songs added. 
		*@param category it is the category of the user in the app. 
		*/
	public void setUserCategory (Category userCategory) {
		this.userCategory = userCategory;
	}
	
	/**
		*This method adds new users.
		*<b>pre: </b> The user has to enter their user name, their password and their age
		*<b>post: </b> The data will be saved and their first category will be Newbie.
		*/
	
public String addUser(String userName, int password, int age, String category) {
        String msg = "No se ha agregado ningun usuario";
        User newUser = new User(userName, password, age);

        boolean scape = false;

        for (int i = 0; i < SIZE_USER && !scape; i++) {
            if (userZ[i] == null) {
                userZ[i] = newUser;
                scape = true;
                msg = "Se agrego el usuario correctamente";
            }

        }

        return msg;
    }

	/**
		*This method shows the data of each user.
		*<b>pre: </b> The user has to enter their user name, their password and their age
		*<b>post: </b> The data will be shown and their first category will be Newbie.
		*/
    public String showUser() {
        String contents = "";

        contents = "-------------------User-----------------------\n";
        contents += "Nombre : " + getUserName() + "\n";
        contents += "Contraseña: " + getPassword() + "\n";
        contents += "Edad: " + getAge() + "\n";
        contents += "Categoria: " + getUserCategory() + "\n";

        for (int i = 0; i < SIZE_USER; i++) {
            if (userZ[i] != null) {
                contents += userZ[i].showUser();
            }

        }
        return contents;
    }

}
 