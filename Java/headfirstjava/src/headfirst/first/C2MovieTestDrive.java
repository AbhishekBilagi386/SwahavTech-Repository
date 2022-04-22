package headfirst.first;

class movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.print("Playing the movie");
	}
}

public class C2MovieTestDrive {

	public static void main(String[] args) {
		movie one = new movie();
		one.title = "Transformer";
		one.genre = "Action";
		one.rating = 3;
		movie two = new movie();
		two.title = "Friends";
		two.genre = "Comedy";
		two.rating = 7;
		two.playIt();
		movie three = new movie();
		three.title = "interstellar";
		three.genre = "Sci-fi";
		three.rating = 9;

	}

}
