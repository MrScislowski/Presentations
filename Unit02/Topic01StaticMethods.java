public class Topic01StaticMethods {

    // this static method doesn't actually manage to 
    // modify the value passed into it
    // primitive type variables can't be modified by
    // a static method
    public static void increaseBySeven(int num) {
        num = num + 7;
    }

    public static int increasedBySeven(int num) {
        int result = num + 7;
        return result;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("a is " + a);
        increaseBySeven(a);
        System.out.println("a is " + a);
        a = increasedBySeven(a);
        System.out.println("a is " + a);
    }
}

// javac Topic01StaticMethods.java;  java Topic01StaticMethods