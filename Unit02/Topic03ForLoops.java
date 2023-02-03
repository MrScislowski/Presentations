// some comments

/*
 * <initialization>
 * while (<boolean statement>) {
 * <statements to repeat>
 * <increment>
 * }
 * 
 * for(<initialization>; <boolean statement>; <increment>) {
 * <statements to repeat>
 * }
 */
public class Topic03ForLoops {

    public static void printTenHellos() {
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");
    
        for (int num = 4; num <= 10; num = num + 1) {
            System.out.println(num + "th Hello");
        }
    }

    public static void main(String[] args) {
        printTenHellos();
    }
}
// javac .\Topic03ForLoops.java; java Topic03ForLoops