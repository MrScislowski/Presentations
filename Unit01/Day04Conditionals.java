public class Day04Conditionals {
    public static void main(String[] args) {
        // RandInt w/ error checking
        if (args.length < 1) {
            System.out.println("Please provide one command line argument");
        } else {
            int upperLimit = Integer.parseInt(args[0]);
            int randInt = (int) (Math.random() * upperLimit);
            System.out.println(randInt);
        }


        // IntOps
    }
}
