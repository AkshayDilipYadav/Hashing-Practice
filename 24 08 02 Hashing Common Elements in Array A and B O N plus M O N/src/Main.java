import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0;  i < n; i++){A[i] = sc.nextInt();}
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }
        int[] result = solve(A, B);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : B) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}