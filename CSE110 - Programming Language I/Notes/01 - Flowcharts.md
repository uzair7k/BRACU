## Definition
A flowchart is a pictorial way of visualizing each step of a program/code using distinct shapes to represent different functionalities of the code.

| Shape             | Use                                   |
| ----------------- | ------------------------------------- |
| Ellipse (stadium) | Start / End                           |
| Parallelogram     | Input (prompt/read) or Output (print) |
| Rectangle         | Calculation / variable assignment     |
| Diamond           | Condition (if/else, loop test)        |
| Circle            | Connector — flow merges or splits     |
| Arrow             | Execution order                       |

---

## Sequential Flow

Pattern: `Start → Input → Process → Output → End`

```mermaid
flowchart TD
    A([Start]) --> B[/Prompt "Enter first number"/]
    B --> C[/Read num1/]
    C --> D[/Prompt "Enter second number"/]
    D --> E[/Read num2/]
    E --> F[sum = num1 + num2]
    F --> G[/Print sum/]
    G --> H([End])
```

---

## Decision Making (if / else)

Diamond = condition, two branches (True/False), both merge back to one path.

```mermaid
flowchart TD
    A([Start]) --> B[/Read num/]
    B --> C{num % 2 == 0?}
    C -->|True| D[/Print "Even"/]
    C -->|False| E[/Print "Odd"/]
    D --> F([End])
    E --> F
```

**Nested if/else** — chain another diamond off the False branch:

```mermaid
flowchart TD
    A([Start]) --> B[/Read marks/]
    B --> C{marks >= 80?}
    C -->|True| D[/Print "A"/]
    C -->|False| E{marks >= 60?}
    E -->|True| F[/Print "B"/]
    E -->|False| G[/Print "C"/]
    D --> H([End])
    F --> H
    G --> H
```

## Loops
```mermaid
flowchart TD
    A([Start]) --> B[i = 1]
    B --> C{i <= 5?}
    C -->|True| D[/Print i/]
    D --> E[i = i + 1]
    E --> C
    C -->|False| F([End])
```

### Running sum pattern:
```mermaid
flowchart TD
    A([Start]) --> B[sum = 0, i = 1]
    B --> C{i <= n?}
    C -->|True| D[sum = sum + i]
    D --> E[i = i + 1]
    E --> C
    C -->|False| F[/Print sum/]
    F --> G([End])
```
## Nested Loops
Outer loop's body contains a **complete** inner loop — its own init, condition, and update. Inner loop runs to completion for every single outer iteration.

```mermaid
flowchart TD
    A([Start]) --> B[i = 1]
    B --> C{i <= 3?}
    C -->|True| D[j = 1]
    D --> E{j <= 3?}
    E -->|True| F[/Print i, j/]
    F --> G[j = j + 1]
    G --> E
    E -->|False| H[i = i + 1]
    H --> C
    C -->|False| I([End])
```

**Key point:** `j` resets to 1 every time `i` advances — that's what makes it nested, not two separate loops.

---
## Quick Reference
- **Sequence:** Start → I/O → Process → I/O → End
- **Decision:** diamond, two labeled branches, merge back to one path
- **Loop:** diamond condition, body, update, arrow back to condition
- **Nested loop:** outer body = full inner loop (init → condition → body → update → loop back)

# Worksheet:
1. Write a short description and draw a flowchart to make a cup of tea or coffee. The steps could vary person to person.
```mermaid
flowchart TD
    A([Start]) --> B[Boil water]
    B --> C[Add tea leaves / coffee powder]
    C --> D[Add sugar]
    D --> E[Add milk]
    E --> F[Stir]
    F --> G([End])
```
2. Draw a flowchart to find the result of addition of two numbers given by a user. Also, find their average.
```mermaid
flowchart TD
    A([Start]) --> B[/Read num1/]
    B --> C[/Read num2/]
    C --> D[sum = num1 + num2]
    D --> E[avg = sum / 2]
    E --> F[/Print sum, avg/]
    F --> G([End])
```
3. Draw a flowchart to take temperature in Fahrenheit and convert it to Celsius and print it.
```mermaid
flowchart TD
    A([Start]) --> B[/Read fahrenheit/]
    B --> C[celsius = fahrenheit - 32 times 5 / 9]
    C --> D[/Print celsius/]
    D --> E([End])
```
4.  Draw a flowchart which takes a number from the user and then multiply it with 10, then add 2050 to the result and divide the number by 5 and show the final result as output.
```mermaid
flowchart TD
    A([Start]) --> B[/Read num/]
    B --> C[result = num times 10 + 2050, then / 5]
    C --> D[/Print result/]
    D --> E([End])
```
5. Write a flowchart that finds the number of hours, minutes, and seconds in a given number of seconds. For example, how many hours, minutes, and seconds are there in 10,000 seconds?
```mermaid
flowchart TD
    A([Start]) --> B[/Read totalSeconds/]
    B --> C[hours = totalSeconds / 3600]
    C --> D[minutes = totalSeconds % 3600 / 60]
    D --> E[seconds = totalSeconds % 60]
    E --> F[/Print hours, minutes, seconds/]
    F --> G([End])
```
6. Write a flowchart to print the area of a triangle taking base and height input from the user.
```mermaid
flowchart TD
    A([Start]) --> B[/Read base/]
    B --> C[/Read height/]
    C --> D[area = 0.5 * base * height]
    D --> E[/Print area/]
    E --> F([End])
```
7. Write a flowchart that reads the values for the three sides x, y, and z of a triangle, and then calculates its area. The area is calculated as follows: Area = s (s − x) (s − y) (s − z), where s is (x + y + z)/2
```mermaid
flowchart TD
    A([Start]) --> B[/Read x/]
    B --> C[/Read y/]
    C --> D[/Read z/]
    D --> E[s = x + y + z / 2]
    E --> F[area = sqrt of s times s-x times s-y times s-z]
    F --> G[/Print area/]
    G --> H([End])
```
8. Assume there are two variables x and y. Take Values of these variables from the user. For example, the user gave the following two values. x = 46; y = 27; Now exchange / swap values in such a way so that printing the variable x gives 27 and y gives 46.
```mermaid
flowchart TD
    A([Start]) --> B[/Read x/]
    B --> C[/Read y/]
    C --> D[temp = x]
    D --> E[x = y]
    E --> F[y = temp]
    F --> G[/Print x, y/]
    G --> H([End])
```
9. Take the value of a, b, c from the user. Then swap the values and print in such a way that: Value of a goes to b, Value of b goes to c, Value of c goes to a
```mermaid
flowchart TD
    A([Start]) --> B[/Read a/]
    B --> C[/Read b/]
    C --> D[/Read c/]
    D --> E[temp = c]
    E --> F[c = b]
    F --> G[b = a]
    G --> H[a = temp]
    H --> I[/Print a, b, c/]
    I --> J([End])
```
10. Suppose a government employee has to pay 3000 taka plus 2.5% tax of his yearly salary. Now take the salary input from a user and print his tax.
```mermaid
flowchart TD
    A([Start]) --> B[/Read salary/]
    B --> C[tax = 3000 + salary times 2.5 / 100]
    C --> D[/Print tax/]
    D --> E([End])
```
