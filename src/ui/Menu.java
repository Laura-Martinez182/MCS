package ui;
import model.*;
import java.util.Scanner;
import java.lang.*;
public class Menu {
	private final static int ADD_USER = 1;
	private final static int SHOW_USER = 2;
	private final static int ADD_PLAYLIST = 3;
	private final static int SHOW_PLAYLIST = 4;
	private final static int EXIT = 5;
	
	
	private static Scanner sc = new Scanner(System.in);
	private User user;
    private Privatepl playl;
    private Publicpl play2;
    private Restrictedpl play3;
    private Playlist play4;
    private Song Song;
	
	 int preg = 0;

	
	public Menu() {
		this.user = readNewUser();
}

		/**
		*This method create the main user.
		*<b>pre: </b> The user has to enter their user name, their password and their age
		*<b>post: </b> The data will be saved, their first category will be Newbie and the main user will be created.
		*/
public User readNewUser() {
        System.out.println("Digite su nombre de usuario");
        String userName = sc.nextLine();
        System.out.println("Digite su contraseña");
        int password = sc.nextInt();
        System.out.println("Digite su edad");
        int age = sc.nextInt();
        sc.nextLine();
        user = new User(userName, password, age);
        return user;

    }
	/**
		*This method shows the options in a menu.
		*<b>pre: </b> The user has to sign in.
		*<b>post: </b> The menu will be shown.
		*/
	
	public void showMenu() {
		System.out.println("Escoja que desea hacer: ");
        System.out.println("1. Agregar usuario");
        System.out.println("2. Mostrar usuario");
        System.out.println("3. Agregar playlist");
        System.out.println("4. Mostrar playlist");
        System.out.println("5. Salir");

    }
		/**
		*This method saves the option choosen by the user.
		*<b>pre: </b> The user has to enter a number between 1 and 5.
		*<b>post: </b> The option will be save.
		*/
    public int readOption() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
		/**
		*This method create the new users.
		*<b>pre: </b> The user has to enter their users names, their passwords and their ages
		*<b>post: </b> The data will be saved, their first category will be Newbie and the new users will be created.
		*/
	public String readUser() {
        System.out.println("Digite su nombre");
        String userName = sc.nextLine();
        System.out.println("Digite su password");
        int password = sc.nextInt();
        System.out.println("Digite su edad");
        int age = sc.nextInt();
        sc.nextLine();
        return user.addUser(userName, password, age, null);
    }

		/**
		*This method shows another menu to choose what type of playlist they want to create. 
		*<b>pre: </b> The user has to enter a number between 1 and 3.
		*<b>post: </b> The option choosen will be saved in "select" and it will let the user interact with the type of playlist that they choose
		*/
	public int selectPlaylist() {

        System.out.println("Cual de las tres variantes deseas seleccionar:\n"
                + "1.PlayList Privada\n"
                + "2.PlayList Restringido\n"
                + "3.PlayList Publico");
        int select = sc.nextInt();

        switch (select) {
            case 1:
                readPrivatePl();
                System.out.println("***Registro Exitoso PlayList Privada***\n");
                System.out.println("Cuantas canciones deseas agregar");
                preg = sc.nextInt();
                sc.nextLine();
                readSong();
                System.out.println(Song.showSong());
                break;
            case 2:
                readRestrictedPl();
                System.out.println("***Registro Exitoso PlayList Restringido***");
				System.out.println("Cuantas canciones deseas agregar");
                preg = sc.nextInt();
                sc.nextLine();
                readSong();
                System.out.println(Song.showSong());
                break;
            case 3:
                readPublicPl();
                System.out.println("***Registro Exitoso PlayList Publico***");
				System.out.println("Cuantas canciones deseas agregar");
                preg = sc.nextInt();
                sc.nextLine();
                readSong();
                System.out.println(Song.showSong());
                break;
            default:
                break;
        }

        return select;
    }
	
	public String addSongs(String title, String artist, String date, int duration, String gen) {
        String msg = "No se ha agregado ninguna cancion";
        Song newUser = new Song(title, artist, date, duration , gen);

        boolean scape = false;

        for (int i = 0; i < Song.SIZE_SONG && !scape; i++) {
            if (Song.addSong[i] == null) {
                Song.addSong[i] = newUser;
                scape = true;
                msg = "Se agrego la canción correctamente";
            }

        }

        return msg;
    }
	/**
		*This method saves the song´s data.
		*<b>pre: </b> The user has to enter the title, the artist, the date, the duration of the song and choose an option of the genre
		*<b>post: </b> The data will be saved.
		*/
public Song readSong() {
	for (int i = 0; i < preg; i++) {
            System.out.println("Digite el nombre la cancion");
            String title = sc.nextLine();
            System.out.println("Digite el nombre la Artista");
            String artist = sc.nextLine();
			System.out.println("Digite la fecha de publicacion");
			String date = sc.nextLine();
            System.out.println("Digite la duracion");
            int duration = sc.nextInt();
            System.out.println("Digite el genero \n"
                    + "1. rock\n"
                    + "2. hip hop\n"
                    + "3. clásica\n"
                    + "4. reggae\n"
                    + "5. salsa\n"
                    + "6. metal");
            int genre = sc.nextInt();
            sc.nextLine();
			
			 if (genre == 1) {
                Song = new Song(title, artist, date, duration, "rock");
            } else if (genre == 2) {
                Song = new Song(title, artist, date, duration, "hip hop");
            } else if (genre == 3) {
                Song = new Song(title, artist, date, duration, "clásica");
            } else if (genre == 4) {
                Song = new Song(title, artist, date, duration, "reggae");
            } else if (genre == 5) {
                Song = new Song(title, artist, date, duration,"salsa");
            } else if (genre == 6) {
                Song = new Song(title, artist, date, duration, "metal");
            }

        }
        return Song;
    }
 public String ReadSongs() {
	 for (int i = 0; i < preg; i++) {
            System.out.println("Digite el nombre la cancion");
            String title = sc.nextLine();
            System.out.println("Digite el nombre la Artista");
            String artist = sc.nextLine();
			System.out.println("Digite la fecha de publicacion");
			String date = sc.nextLine();
            System.out.println("Digite la duracion");
            int duration = sc.nextInt();
            System.out.println("Digite el genero \n"
                    + "1. rock\n"
                    + "2. hip hop\n"
                    + "3. clásica\n"
                    + "4. reggae\n"
                    + "5. salsa\n"
                    + "6. metal");
            int genre = sc.nextInt();
            sc.nextLine();
            if (genre == 1) {
                return addSongs(title, artist, date, duration, "rock");
            } else if (genre == 2) {
                return addSongs(title, artist, date, duration, "hip hop");
            } else if (genre == 3) {
                return addSongs(title, artist, date, duration, "clásica");
            } else if (genre == 4) {
                return addSongs(title, artist, date, duration, "reggae");
            } else if (genre == 5) {
                return addSongs(title, artist, date, duration, "salsa");
            } else if (genre == 6) {
                return addSongs(title, artist, date, duration, "metal");
            }
        }
        return "Error";
    }
		/**
		*This methods create the playlist that the user has choosen
		*<b>pre: </b> The user has to enter the title of the playlist
		*<b>post: </b> The playlist with the title will be created
		*/
public Privatepl readPrivatePl() {
        System.out.println("Digite el nombre de la playlist");
        String playlistName = sc.nextLine();
        sc.nextLine();
        playl = new Privatepl(playlistName, 0, null);
        return playl;
    }
	
	 public Publicpl readPublicPl() {
        System.out.println("Digite el nombre de la playlist");
        String playlistName = sc.nextLine();
        sc.nextLine();
        play2 = new Publicpl(playlistName, 0, null, null, 0);
        return play2;

    }
	
	public Restrictedpl readRestrictedPl() {
        System.out.println("Digite el nombre de la playlist");
        String playlistName = sc.nextLine();
        sc.nextLine();
        play3 = new Restrictedpl(playlistName, 0, null);
        return play3;

    }
	/**
		*This method do what the user has choosen.
		*<b>pre: </b> The user has to choose an option
		*<b>post: </b> It will do what the user want 
		*@param choice it is the choice of the user.  5 > choice > 1   
		*/
public void doOeration(int choice) {
        switch (choice) {
            case ADD_USER:
                System.out.println(readUser());
                break;
            case SHOW_USER:
                System.out.println(user.showUser());
                break;
            case ADD_PLAYLIST:
                System.out.println(selectPlaylist());
                break;
            case SHOW_PLAYLIST:
                 System.out.println(playl.showPlayList());
                break;
            case EXIT:
                System.out.println("****Has finalizado el programa****");
                System.exit(0);
                break;
            default:
                System.out.println("Solo números entre 1 y 5");
        }

    }
	
	/**
	*This method groups all the methods needed to make the program work.
	*<b>pre: </b> All the preconditions for the others methods altogether.
	*<b>post: </b> It saves the results of all the methods to show them in the Main.
	*/

    public void startProgram() {
        int option;
        do {
            showMenu();
            option = readOption();
            doOeration(option);
        } while (option != 5);
    }

}


	








