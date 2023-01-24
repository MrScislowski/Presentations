public class Day06Strings {
    public static void main(String[] args) {
        // indexOf demo

        String text = args[0];
        String searchTerm = args[1];
        System.out.println(searchTerm + " occurs at position " + text.indexOf(searchTerm));
        
    }
}