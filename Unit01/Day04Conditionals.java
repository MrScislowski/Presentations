public class Day04Conditionals {
    public static void main(String[] args) {
        // caughtSpeeding
        int speed = Integer.parseInt(args[0]);
        boolean isBirthday = Boolean.parseBoolean(args[1]);

        if (isBirthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            System.out.println(0);
        } 
        else if (speed <= 80) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
