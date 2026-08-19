import java.util.Scanner;
public class String_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int code = 65; code <= 90; code++) {
            char letter = (char) code;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == letter) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(letter + " which is " + code + " was found " + count + " time(s)");
            }
        }
    }
}
