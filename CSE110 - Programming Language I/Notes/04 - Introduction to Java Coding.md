# 4.1 - Essential Keywords

| Keyword | Meaning |
|---|---|
| `public` | Access modifier — makes classes, attributes, methods, and constructors accessible from other classes |
| `class` | Declares a class |
| `main` | Declares the main method — entry point of the program |
| `args` | Arguments passed in via the command line |
| `static` | Memory management modifier — shares a property/method with the whole class rather than a single instance |
| `void` | Method declaration modifier — the method returns no value |
| `String[] args` | Array of strings holding the command-line arguments |

```java
public class Example1 {
    public static void main(String args[]) {
        System.out.println("Hello World.");
    }
}
```

---
# 4.2 - Scope
A **block** is any code inside `{ }`. The **scope** of a variable is the block it was declared in — it only exists and can only be accessed/modified within that block (and any nested blocks inside it).
- A variable declared inside a loop's `{ }` only exists within that loop.
- A variable declared inside a method's `{ }` only exists within that method.
Trying to use a variable outside its scope causes a `cannot find symbol` compile error.

```java title:"Example 1 — accessing loop variables outside the loop (fails):"
public class Example1 {
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int z = x + y;
        while (x > 5) {
            int m = 3;      // m initialized inside loop
            int n = m + x;  // n initialized inside loop
            x--;
        }
        System.out.println("Sum of x+y = " + z);
        System.out.println(m + " " + n); // m & n not accessible outside loop
    }
}
```
**Output:** `error: cannot find symbol`

```java title:"Example 2 — using loop variables correctly, inside the loop:"
public class Example2 {
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int z = x + y;
        while (x > 5) {
            int m = 3;
            int n = m + x;
            System.out.println(m + " " + n); // accessible only inside loop
            x--;
        }
        System.out.println("Sum of x+y = " + z);
    }
}
```
**Output:**
```
3 12
3 11
3 10
3 9
Sum of x+y = 35
```

**Example 3 — modifying a loop variable from outside the loop (fails):**
```java
public class Example3 {
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int z = x + y;
        while (x > 5) {
            int m = 3;
            int n = m + x;
            x--;
        }
        System.out.println("Sum of x+y = " + z);
        m += 5; // m cannot be modified outside loop
        System.out.println(m + " " + n); // m & n not accessible outside loop
    }
}
```
**Output:** `error: cannot find symbol`

**Example 4 — modifying a loop variable correctly, inside the loop:**
```java
public class Example4 {
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int z = x + y;
        while (x > 5) {
            int m = 3;
            int n = m + x;
            m += 5; // m can only be modified inside loop
            System.out.println(m + " " + n);
            x--;
        }
        System.out.println("Sum of x+y = " + z);
    }
}
```
**Output:**
```
8 13
8 12
8 11
8 10
8 9
Sum of x+y = 35
```

---
# 4.3 - Printing
Output is produced with `System.out.println("text")` or `System.out.print("text")`.
- `System.out` invokes the `System` class to generate output.
- `println()` prints the given text and adds a new line after it.
- `print()` prints the given text with **no** trailing new line.

```java title:"println() — new line after each call:"
public class Example1 {
    public static void main(String args[]) {
        int x = 10;
        while (x > 5) {
            System.out.println(x); // new line added at the end
            x--;
        }
    }
}
```
**Output:**
```
9
8
7
6
```

```java title:"print() — no new line:"
public class Example1 {
    public static void main(String args[]) {
        int x = 10;
        while (x > 5) {
            System.out.print(x); // no new line added
            x--;
        }
    }
}
```
**Output:** `109876`

---
# 4.4 - Comments
Comments are non-executed lines meant to explain code to a reader; the compiler skips them. There are three types:

| Type          | Description                                                                                                                                                                | Example                                     |
| ------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------- |
| Single-line   | Short, one-line comment starting with `//`. Everything after `//` on that line is ignored by the compiler.                                                                 | `// This is a single-line comment.`         |
| Multi-line    | Used for longer explanations spanning several lines. Opens with `/*` and closes with `*/`, avoiding the need to repeat `//` on every line.                                 | `/* Multi-line comment starts...\nends. */` |
| Documentation | Also called a "doc comment," used to auto-generate reference documentation for a class/package. Same convention as multi-line, but each new line starts with an extra `*`. | `/** Doc comment...\n * tag\n */`           |

```java
// Single-line comment

/* Multi-line comment starts
This is a multi-line comment.
Multi-line comment ends. */

/** Doc comment starts
 * continue
 * add tags
 * doc comment ends
 */
```

---
# 4.5 - Worksheet
**A.** Take two integers from the user and print their sum and average.
```java title:"Answer"
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		int sum = a + b;
		double avg = (a + b) / 2.0;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}
}
```

**B.** Given `x`, `y`, and `z`, evaluate: `result = x + (x % 2 + y * z ^ (4 / 2))`
```java title:"Answer"
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result = x + ((x % 2 + y * z) ^ (4 / 2));
        System.out.println("Result = " + result);
    }
}
```

**C.** Take a first name and last name from the user and print the full name.

| Input          | Output                    |
| -------------- | ------------------------- |
| Samiha / Haque | `Full Name: Samiha Haque` |
| Sabbir / Ahmed | `Full Name: Sabbir Ahmed` |
```java title:"Answer"
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println(firstName + " " + lastName);
	}
}
```

**D.** Take a first name, middle name, and last name from the user and print the full name. The middle name is optional — if absent, the user enters an empty string for it.

| Input                    | Output                            |
| ------------------------ | --------------------------------- |
| Aiman / Jabeen / Ramisa  | `Full Name: Aiman Jabeen Ramisa`  |
| Dibyo / Fabian / Dofadar | `Full Name: Dibyo Fabian Dofadar` |
| Sifat / (empty) / Tanvir | `Full Name: Sifat Tanvir`         |

```java title:"Answer"
import java.util.Scanner;
public class WorksheetD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String middleName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName;
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        System.out.println("Full Name: " + fullName);
    }
}
```
