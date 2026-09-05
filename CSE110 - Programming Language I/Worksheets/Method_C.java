public class Method_C {
    public static void main(String[] args) {
        show_triangle(4);
        System.out.println();
        show_triangle(5);
    }

    static void show_spaces(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
    }

    static void show_palindrome(int b) {
        for (int i = 1; i <= b; i++) {
            System.out.print(i);
        }
        for (int i = b - 1; i >= 1; i--) {
            System.out.print(i);
        }
    }

    static void show_triangle(int a) {
        for (int i = 1; i <= a; i++) {
            show_spaces(a - i);
            show_palindrome(i);
            System.out.println();
        }
    }
}
