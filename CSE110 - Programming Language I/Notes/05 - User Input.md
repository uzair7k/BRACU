# 5.1 Creating a Scanner
`Scanner` is a class used to read input from the user. It lives in the `java.util` package, so it must be imported before it can be used:
```java
import java.util.Scanner; // Import the Scanner class
```
Inside the class, an object of `Scanner` has to be created before it can be used to read input:
```java
Scanner sc = new Scanner(System.in); // Creating a Scanner
```

---
# 5.2 Inputting Different Datatypes
Each datatype has its own method for reading input, since the variable being assigned to must match the type being read.
-  **Boolean** - `nextBoolean()`
-  **Byte** - `nextByte()`    
-  **Short** - `nextShort()` 
-  **Long** - `nextLong()`    
-  **Integer** - `nextInt()`   
-  **Float** - `nextFloat()`  
-  **Double** - `nextDouble()` 
-  **String** - `nextLine()`    

---
# 5.3 Code Examples
```java title:"Take a float from the user and print it"
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num);
    }
}
```
Input: `5.5` → Output: `5.5`

```java title:"Take a name (String), age (int), and salary (double), then print them"
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
```
Input: `Sami`, `23`, `1200.5` → Output:
```
Enter name, age and salary:
Name: Sami
Age: 23
Salary: 1200.5
```

```java title:"Take a number and check if it's divisible by both 3 and 7."
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // integer input
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Input `21` → Output `Yes`
Input `18` → Output `No`

```java title:"Take two Strings and merge them"
import java.util.Scanner;
class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}
```
Input `Hello`, `Darkness` → Output `HelloDarkness`
Input `5`, `7` → Output `57` *(strings, not numbers — concatenation, not addition)*

---
# 5.4 Worksheet
**A.** Take the user's last name as input and print it back.
**B.** Read two integers and print their sum, difference, product, and average.
**C.** Read the radius of a circle and print its area and circumference.
**D.** Take a floating-point number as input and print its square.
**E.** Read two strings and print their "sum" — note the inputs here are numeric strings, so this is really testing numeric conversion, not concatenation.
