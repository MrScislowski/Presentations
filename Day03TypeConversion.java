public class Day03TypeConversion {
    public static void main(String[] args) {
        // EXPLICIT (FUNCTIONS) CONVERSIONS

        // parseInt, parseDouble, parseBoolean (useful for command line arguments)
        // String -> int/double/boolean
        int i1 = Integer.parseInt("31");
        System.out.println(i1);
        double d1 = Double.parseDouble("3.14159");
        System.out.println(d1);
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);

        // Math.round
        // double -> long (rounds; doesn't just always truncate decimal)
        // I use int more often than long, so this function is frustrating to me
        long l1 = Math.round(2.718);
        System.out.println(l1);


    }
}
