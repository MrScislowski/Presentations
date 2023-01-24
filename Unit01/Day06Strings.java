import java.util.Scanner;

public class Day06Strings {
    public static void main(String[] args) {
        // indexOf demo

        System.out.println("please type in the long text you want to search within");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        System.out.println("Thanks, now enter the search term");
        String searchTerm = scanner.nextLine();

        System.out.println(searchTerm + " occurs at position " + text.indexOf(searchTerm));

        scanner.close();
        
    }
}