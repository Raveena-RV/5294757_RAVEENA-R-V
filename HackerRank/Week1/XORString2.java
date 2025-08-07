import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String result = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i))
                result += "0";
            else
                result += "1";
        }
        System.out.println(result);
    }
}
