import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i < n; i++){A[i]= sc.nextInt();}

        int uniqueCount = uniqueElements(A);
        System.out.println(uniqueCount);

    }
    public static int uniqueElements(int[] A){
        Set<Integer> uniqueElements = new HashSet<>();

        for(int num : A){uniqueElements.add(num);}

        return uniqueElements.size();
    }

}