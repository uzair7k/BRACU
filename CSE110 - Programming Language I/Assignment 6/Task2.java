import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String vowels = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                vowels += c;
            }
        }

        String reversedVowels = "";
        for (int i = vowels.length() - 1; i >= 0; i--) {
            reversedVowels += vowels.charAt(i);
        }

        String result = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                result += reversedVowels.charAt(idx);
                idx++;
            } else {
                result += c;
            }
        }

        System.out.println(result);
    }
}
