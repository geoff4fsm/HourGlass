import java.util.*;

//You are given a 6x6 2D array. An hourglass in an array is a portion shaped like this:
//        a b c
//          d
//        e f g
// Find the max sum of all possible hourglasses in array

public class HourGlass {

    static int[][] data;

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        data = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                data[i][j] = input.nextInt();
            }
        }
        int sum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            for ( int j = 1; j < 5; j++ ) {
                sum = getSum(i,j);
                if ( sum > maxSum ) maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }

    static int getSum(int i, int j) {
        int sum = 0;
        sum += data[i-1][j-1]; // top
        sum += data[i-1][j];
        sum += data[i-1][j+1];

        sum += data[i][j];  // middle

        sum += data[i+1][j-1]; // bottom
        sum += data[i+1][j];
        sum += data[i+1][j+1];

        return sum;
    }
}
