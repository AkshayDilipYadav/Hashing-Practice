import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++){A[i] = sc.nextInt();}
        int result = hasZeroSumSubarray(A);
        System.out.println(result);
     }

     public static int hasZeroSumSubarray(int[] A){

         Set<Long> prefixSum = new HashSet<>();
         long currentSum = 0;
         for(int num : A){
             currentSum += num;
             if(currentSum == 0 || prefixSum.contains(currentSum)){return 1;}
             prefixSum.add(currentSum);
         }
         return 0;
     }

}