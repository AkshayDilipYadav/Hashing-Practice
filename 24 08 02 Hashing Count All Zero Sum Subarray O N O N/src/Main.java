import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int result = countZeroSumSubarray(A);
        System.out.println(result);
     }

     public static int countZeroSumSubarray(int[] A){
         int MOD = 1000000007;
         Map<Long, Integer> prefixSumCount = new HashMap<>();
         long currentSum = 0;
         int count = 0;

         prefixSumCount.put(0L, 1);
         for(int num : A){
             currentSum += num;
             if(prefixSumCount.containsKey(currentSum)){
                 count = (count + prefixSumCount.get(currentSum)) % MOD;
             }
             prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
         }
         return count;
     }


}