import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] A = new int[n];
for(int i = 0; i < n; i++){
    A[i] = sc.nextInt();
}
int result = firstRepeatingElement(A);
System.out.println(result);
    }
public static int firstRepeatingElement(int[] A){
    HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
    int minIndex = Integer.MAX_VALUE;
    int firstRepeatingElement = -1;

        for(int i = 0; i < A.length; i++){
        int num = A[i];
        if(elementIndexMap.containsKey(num)){
            if(elementIndexMap.get(num) < minIndex){
                minIndex = elementIndexMap.get(num);
                firstRepeatingElement = num;
            }
        }
        else{elementIndexMap.put(num, i);}


    }
        return firstRepeatingElement;
}
}