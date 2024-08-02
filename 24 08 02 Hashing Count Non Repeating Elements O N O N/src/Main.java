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
        int result = countElements(A);
        System.out.println(result);
    }

    public static int countElements(int[] A){
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : A){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for(int freq : freqMap.values()){
            if(freq == 1){count++;}

        }
        return count;
    }
}