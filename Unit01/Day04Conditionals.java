public class Day04Conditionals {
    public static void main(String[] args) {
        // ThreeEqual
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b) {
            if (c == a) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } else {
            System.out.println("not equal");
        }

        


    }
}
