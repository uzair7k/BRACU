public class LabQ6 {
    public static void main(String[] args) {
        String markStr = "55";
        int mark = 0;
        for (int i = 0; i < markStr.length(); i++) {
            mark = mark * 10 + (markStr.charAt(i) - '0');
        }
        printGrade(mark);
        markStr = "88";
        mark = 0;
        for (int i = 0; i < markStr.length(); i++) {
            mark = mark * 10 + (markStr.charAt(i) - '0');
        }
        printGrade(mark);
        markStr = "101";
        mark = 0;
        for (int i = 0; i < markStr.length(); i++) {
            mark = mark * 10 + (markStr.charAt(i) - '0');
        }
        printGrade(mark);
    }
    public static void printGrade(int mark) {
        if (mark > 100) {
            System.out.println("Invalid Mark");
        } else if (mark >= 90) {
            System.out.println("A");
        } else if (mark >= 80) {
            System.out.println("A-");
        } else if (mark >= 70) {
            System.out.println("B");
        } else if (mark >= 60) {
            System.out.println("C");
        } else if (mark >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
