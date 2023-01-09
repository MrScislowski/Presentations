class Day02CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("The first argument provided was: " + args[0]);
        System.out.println("The second argument provided was: " + args[1]);

        int result;
        result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(args[0] + " + " + args[1] + " = " + result);
    }
}