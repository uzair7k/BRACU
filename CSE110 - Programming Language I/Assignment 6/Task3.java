import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Names of the spells:");

        String longestSpell = "";
        int longestLength = 0;
        int powerLevel = 0;

        String input = sc.nextLine();
        while (!input.equals("stop")) {
            String cleaned = "";
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    cleaned += (char) (c - 32);
                } else if (c >= 'A' && c <= 'Z') {
                    cleaned += c;
                }
            }

            if (cleaned.length() > longestLength) {
                longestLength = cleaned.length();
                longestSpell = cleaned;

                int power = 0;
                for (int i = 0; i < cleaned.length(); i++) {
                    power += (int) cleaned.charAt(i);
                }
                powerLevel = power;
            }

            input = sc.nextLine();
        }

        System.out.println("Largest Spell : " + longestSpell);
        System.out.println("Power Level : " + powerLevel);
    }
}
