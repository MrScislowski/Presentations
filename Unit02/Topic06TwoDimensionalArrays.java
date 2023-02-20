import java.util.Arrays;

public class Topic06TwoDimensionalArrays {

    public static void main(String[] args) {
        // declare and initialize 2D array
        int[][] a = new int[][] {
            {1, 2, 3},
            {4, 5, 6}, 
            {7, 8, 9}};

        // traverse 2D square array to have all values be 1
        final int SQSIZE = 3;
        int[][] a2 = new int[SQSIZE][SQSIZE];
        
        for (int r = 0; r < SQSIZE; r++) {
            for (int c = 0; c < SQSIZE; c++) {
                a2[r][c] = 1;
            }
        }

        System.out.println(Arrays.deepToString(a2));

        // traverse 2D rectangular array to have all values be 1
        int[][] a3 = new int[2][7];

        for (int r = 0; r < a3.length; r++) {
            for (int c = 0; c < a3[0].length; c++) {
                a3[r][c] = 1;
            }
        }

        System.out.println(Arrays.deepToString(a3));

        // traverse 2D ragged array to have all values be 1
        int[][] a4 = new int[][] {
            {1, 2},
            {3},
            {4, 5, 6, 7}
        };

        for (int r = 0; r < a4.length; r++) {
            for (int c = 0; c < a4[r].length; c++) {
                a4[r][c] = 1;
            }
        }

        System.out.println(Arrays.deepToString(a4));


        // write our own code to pring 2d array

        // withAverages



        // double[][] a = new double[][] {
        //     {99, 85, 98},
        //     {98, 57, 79},
        //     {92, 77, 74},
        //     {94, 62, 81},
        //     {99, 94, 92},
        //     {80, 76.5, 67},
        //     {76, 58.5, 90.5},
        //     {92, 66, 91},
        //     {77, 70.5, 66.5},
        //     {89, 89.5, 81}
        // };
    }
}

// javac Topic06TwoDimensionalArrays.java; java Topic06TwoDimensionalArrays