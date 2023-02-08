public class Topic04StringLoops {

    // indexOf solution
    public static int countHi(String str) {
        int count = 0;

        int curPos = 0;
        while (str.indexOf("hi", curPos) != -1) {
            count++;
            curPos = str.indexOf("hi", curPos) + 1;
        }

        return count;
    }


    public static void main(String[] args) {
        
    }
}