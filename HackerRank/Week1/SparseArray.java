import java.util.*;
public class SparseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for(int i = 0;i < n;i++){
            strings[i] = sc.nextLine();
        }
        int q = sc.nextInt();
        sc.nextLine();
        String[] queries = new String[q];
        for(int i = 0;i < q;i++){
            queries[i] = sc.nextLine();
        }
        for(int i = 0;i < q;i++){
            int count = 0;
            for(int j = 0;j < n; j++){
                if(queries[i].equals(strings[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}