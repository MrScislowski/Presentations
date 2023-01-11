public class Day04Conditionals {
    public static void main(String[] args) {
        // IntOps w/ error checking
        if (args.length < 2) {
            System.out.println("Please provide two command line arguments");
        } else {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);
    
            System.out.println(first + " + " + second + " = " + (first + second));
            System.out.println(first + " - " + second + " = " + (first - second));
            System.out.println(first + " * " + second + " = " + (first * second));
            if (second == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(first + " / " + second + " = " + (first / second));
                System.out.println(first + " % " + second + " = " + (first % second));
            }
            
        }
        


    }
}
