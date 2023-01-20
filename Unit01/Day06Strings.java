public class Day06Strings {
    public static void main(String[] args
    ) {
        // endsLy
        // take a string in args[0], print "true" if it ends
        // in "ly", and false otherwise

        String original = args[0];
        String lastLetters = original.substring(original.length() - 2, original.length());
        if (lastLetters.equals("ly")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}