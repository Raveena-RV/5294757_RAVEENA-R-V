import java.util.*;

public class Main {
    public static int LonelyInteger(List<Integer> a) {
        int xor = 0;
        for (int num : a) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int result = LonelyInteger(a);
        System.out.println(result);

        sc.close();
    }
}
