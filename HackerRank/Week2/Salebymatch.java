import java.util.*;

public class Salebymatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairs = 0;

        for (int sock : ar) {
            countMap.put(sock, countMap.getOrDefault(sock, 0) + 1);
        }

        for (int count : countMap.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        sc.close();
    }
}
