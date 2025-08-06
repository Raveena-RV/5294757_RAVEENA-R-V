import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String ampm = s.substring(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        } else if (ampm.equals("PM") && hour != 12) {
            hour += 12;
        }

        System.out.printf("%02d%s\n", hour, rest);
    }
}
