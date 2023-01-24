import java.util.Scanner;

public class Day06Strings {
    public static void main(String[] args) {
        // indexOf to parse HTML

        System.out.println("please type in the HTML you want to search within");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        System.out.println("Thanks, now enter the search term");
        String searchTerm = scanner.nextLine();

        int textPos = text.indexOf(searchTerm);
        int closingTagStartPos = text.indexOf("</", textPos);
        int closingTagEndPos = text.indexOf(">", closingTagStartPos);

        System.out.print("The text you entered was within a ");
        System.out.print(text.substring(closingTagStartPos+2, closingTagEndPos));
        System.out.println(" tag");

        scanner.close();
        
    }
}