import java.util.*;
public class reverse_an_array {
    public static void reverse(int numbers[]) {
        int start = 0 , end = numbers.length-1;
        while(start<end) { // here we are talkimg about the index
            //swap
            int temp = numbers[end];
            numbers[end]= numbers[start];
            numbers[start]=temp; // as we kmow the rhs is been assigned to the lhs through the assignment operator

            start++; // first ek index aage badhega last ek index piche aayega 
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,12,8,10};

        reverse(numbers);
        // now to print the numbers 
        for(int i = 0; i<numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
} 