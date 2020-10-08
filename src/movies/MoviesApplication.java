package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        DisplayUI();
        int userChoice = input.getInt("Enter choice here: ");
        displayUserSelection(userChoice);

       
    }

    public static void DisplayUI() {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
    }

    public static void displayUserSelection(Integer option){
        switch(option) {
            case 0: 
                System.out.println("Goodbye! (AOL sound)");
              break;
            case 1:
                DisplaySelectedMovies("all");
              break;
            case 2: 
                DisplaySelectedMovies("animated");
              break;
            case 3:
                DisplaySelectedMovies("drama");
              break;
            case 4:
                DisplaySelectedMovies("horror");
              break;
            case 5: 
                DisplaySelectedMovies("scifi");
              break;
            case 6:
                DisplaySelectedMovies("musical");
                break;
        }
        
        Input answer = new Input();
        if(option != 0 && answer.yesNo()) {
            int userChoice = answer.getInt("Enter another choice: ");
            displayUserSelection(userChoice);
        }
        
    }

    public static void DisplaySelectedMovies(String selectedCategory) {
        Movie[] moviesList = MoviesArray.findAll();
        if(selectedCategory.equals("all")) {
            for(Movie movie : moviesList) {
                System.out.printf("title: %s | category: %s%n", movie.getName(), movie.getCategory());
            }
        }else {
            for(Movie movie : moviesList) {
                if(movie.getCategory().equals(selectedCategory)) {
                    System.out.printf("title: %s | category: %s%n", movie.getName(), movie.getCategory());
                }
            }
        }
    }

    public static Movie[] addMovie(Movie[] arr, Movie movieToAdd) {
        Movie[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = movieToAdd;
        return newArray;
    }

}
