import java.util.*;
public class CountingSort1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[100];
        for(int i = 0;i < n;i++){
            int val = sc.nextInt();
            if(val >= 0 && val < 100){
                freq[val]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < freq.length;i++){
            sb.append(freq[i]);
            if(i != freq.length - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}