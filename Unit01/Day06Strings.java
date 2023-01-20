public class Day06Strings {
    public static void main(String[] args
    ) {
        // firstHalf
        // take a command line string, which has even length
        // print just the first half of the string

        String original = args[0];
        int endIndex = original.length() / 2;
        String firstHalf = original.substring(0, endIndex);
        System.out.println(firstHalf);
    }
}