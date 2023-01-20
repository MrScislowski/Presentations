public class Day06Strings {
    public static void main(String[] args
    ) {
        // conCat
        // take 2 input strings, and join them together
        // BUT the joining point doesn't generate repeated letters

        String s1 = args[0];
        String s2 = args[1];

        String s1End = s1.substring(s1.length()-1, s1.length());
        String s2Start = s2.substring(0, 1);

        String result;
        if (s1End.equals(s2Start)) {
            result = s1 + s2.substring(1, s2.length());
        } else {
            result = s1 + s2;
        }
        System.out.println(result);
    }
}