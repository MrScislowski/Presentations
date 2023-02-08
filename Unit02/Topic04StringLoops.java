public class Topic04StringLoops {

    // substring solution
    public static int countHi(String str) {
        int count = 0;
        for (int pos = 0; pos < str.length()-1; pos++) {
            if (str.substring(pos, pos+2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int pos = 0; pos < str.length()-3; pos++) {
            if (str.substring(pos, pos+2).equals("co") &&
                str.substring(pos+3, pos+4).equals("e")) {
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        System.out.println(countHi("heighiten"));
    }
}