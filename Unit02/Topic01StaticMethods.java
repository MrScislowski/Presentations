public class Topic01StaticMethods {

    // 'return' halts method execution. This logic wouldn't work
    // with print statements, since more than one boolean would
    // be printed sometimes
    public static boolean canSleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        }
        if (!weekday) {
            return true;
        }
        return false;
    }

    public static double square(double x) {
        double result = x * x;
        return result;
    }

    // OVERLOADED FUNCTION
    // (same name, different argument types)
    public static int square(int x) {
        int result = x * x;
        return result;
    }

    public static double hypotenuse(double a, double b) {
        double result = Math.sqrt(square(a) + square(b));
        return result;
    }

    public static void printBanner() {
        System.out.println("################################################################################");
        System.out.println("  WELCOME   ");
        System.out.println("################################################################################");
    }

    public static void main(String[] args) {
        printBanner();
        System.out.println("3 squared is " + square(3));
        int area = square(3);
        printBanner();
        System.out.println("the hypotenuse of a 3-4-5 triangle is " + hypotenuse(3, 4));
        printBanner();
    }
}

// javac Topic01StaticMethods.java;  java Topic01StaticMethods