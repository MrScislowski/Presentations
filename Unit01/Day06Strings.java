public class Day06Strings {
    public static void main(String[] args) {
        // helloName
        // take a command line string, 
        // print "hello " plus that string

        String firstPart = new String("hello ");
        // String firstPart = "hello "; // also works (shorthand)
        
        String result = firstPart + args[0];
        System.out.println(result);
    }
}