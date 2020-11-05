package ui;
import model.*;
import java.util.Scanner;
import java.lang.*;
public class Menu {
	private final static int ADD_USER = 1;
	private final static int SHOW_USER = 2;
	private final static int ADD_SONG = 3;
	private final static int SHOW_SONG = 4;
	private final static int ADD_PLAYLIST = 5;
	private final static int SHOW_PLAYLIST = 6;
	private final static int EXIT = 7;
	
	
	private static Scanner sc = new Scanner(System.in);
	private Mcs mcs;
	
	public Menu() {
		this.mcs = readInitialData();
	
}

public Mcs readInitialData() {
			System.out.println("Escriba el nombre del usuario: ");
			String userName = sc.nextLine();
			System.out.println("Escriba la contraseña del usuario: ");
			String password = sc.nextLine();
			System.out.println("Escriba la edad del usuario: ");
			int age = sc.nextInt();
			System.out.println("Escriba la categoria del usuario: ");
			String userCategory = sc.nextLine();
			user = new User(userName, password, age, userCategory);
			return user;