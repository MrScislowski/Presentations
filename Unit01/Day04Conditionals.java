public class Day04Conditionals {
    public static void main(String[] args) {
        // answerCell
        boolean isMorning = Boolean.parseBoolean(args[0]);
        boolean isMom = Boolean.parseBoolean(args[1]);
        boolean isAsleep = Boolean.parseBoolean(args[2]);


        if (isAsleep) {
            System.out.println(false);
        } else {
            if (isMorning && !isMom) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        }
    }
}
