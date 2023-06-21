//Prefix sum
import java.util.*;

public class max_sum2 {
    public static void maxsubarraysum(int numbers[]) {
        int Currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end =j;
                Currsum=start==0? prefix[end] : prefix[end]-prefix[start-1];
                if(maxsum<Currsum) {
                    maxsum=Currsum;
                }
            }
        }
        System.out.println("max sum :"+maxsum);
    }
    public static void main(String args[]) {
        int numbers[]={1,-2,8,-1,3};
        maxsubarraysum(numbers);
    }
}