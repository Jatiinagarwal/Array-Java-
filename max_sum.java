//Brute Force
import java.util.*;
public class max_sum {
    public static void sum_subarray (int numbers[]) {
        int Currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++) {
            int start = i;
            for(int j = i; j<numbers.length ; j++) { // i+1 isliye nahi rkha kyuki single element vala array bhi chahiye 
                int end = j;
                Currsum = 0;
                for(int k = start ; k<=end ; k++) { 
                    //subarray sum 
                    Currsum += numbers[k];
                }
                System.out.println("Currsum = " + Currsum);
                if(Currsum>Maxsum) {
                    Maxsum = Currsum;
                }
            }
        }
        System.out.println("The maximum sum of amoung all the subarrays is: " + Maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        sum_subarray(numbers);
    }
}