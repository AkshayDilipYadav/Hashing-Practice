import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){A[i] = sc.nextInt();}
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }
        int[] frequencies = findFrequency(A, B);
        for(int freq : frequencies){System.out.print(freq + " ");}
        System.out.println();
    }

    public static int[] findFrequency(int[] A, int[] B){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int  num : A){freqMap.put(num, freqMap.getOrDefault(num, 0)+ 1);}
        int[] result = new int[B.length];
        for(int i = 0; i < B.length; i++){result[i] = freqMap.getOrDefault(B[i], 0);}

        return result;

    }

}