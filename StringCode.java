import java.lang.String;
import java.util.Scanner;

public class StringCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < t; j++) {
            // String input
            String name = sc.next();
            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) <= 57 && name.charAt(i) >= 48) {
                    sum += Integer.parseInt(String.valueOf(name.charAt(i)));
                }
            }
            System.out.println(sum + "\n");
        }
    }
}