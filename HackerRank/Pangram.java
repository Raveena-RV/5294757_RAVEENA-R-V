import java.io.*;

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        System.out.println(pangrams(s));
    }

    public static String pangrams(String s) {
        if (s == null) return "not pangram";

        boolean[] seen = new boolean[26];
        int count = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                    if (count == 26) return "pangram";
                }
            }
        }

        return (count == 26) ? "pangram" : "not pangram";
    }
}
