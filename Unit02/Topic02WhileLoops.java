public class Topic02WhileLoops {

    public static void printTenHellos() {
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        int num = 4;
        while (num <= 10) {
            System.out.println(num + "th Hello");
            num = num + 1;
        }
    }

    public static void main(String[] args) {
        printTenHellos();
    }
}

// javac .\Topic02WhileLoops.java; java Topic02WhileLoops
