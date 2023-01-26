import java.util.Scanner;

public class Day06Strings {
    public static void main(String[] args) {
        // indexOf to parse sentences

        System.out.println("please type in the sentences");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        System.out.println("Thanks, now enter the search word");
        String searchTerm = scanner.nextLine();

        int wordPos = text.indexOf(searchTerm);
        int endOfSentence = text.indexOf(".", wordPos);
        String textUpToWord = text.substring(0, wordPos);
        int startOfSentence = textUpToWord.lastIndexOf(".");
        System.out.println("the word " + searchTerm + " occurs in sentence");
        System.out.println(text.subSequence(startOfSentence+2, endOfSentence+1));

        scanner.close();
        
    }
}

// javac Day06Strings.java; cat sentences.txt | java Day06Strings