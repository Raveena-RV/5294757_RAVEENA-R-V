import java.util.*;
public class DiagonalsDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i< n;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for(int i = 0;i < n;i++){
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][n - 1 -i];
        }
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}