import java.util.*;
public class FlippingBits{
    public static long FlippingBits(long n){
        return n ^ 0xFFFFFFFFL;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            long n = sc.nextLong();
            long result = FlippingBits(n);
            System.out.println(result);
        }
    }
}