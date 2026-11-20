# 3.1 - What Are Operators?
Operators are symbols used to perform operations on one or more operands. In `5+6`, `5` and `6` are the operands, and `+` is the operator.

---
# 3.2 - Arithmetic Operators

| Category       | Name           | Symbol | Operation                                                         | Example       |
| -------------- | -------------- | ------ | ----------------------------------------------------------------- | ------------- |
| Additive       | Addition       | `+`    | Adds two numbers                                                  | `5+6` is `11` |
| Additive       | Subtraction    | `-`    | Subtracts the second number from the first                        | `5-6` is `-1` |
| Multiplicative | Multiplication | `*`    | Multiplies the first number with the second                       | `5*6` is `30` |
| Multiplicative | Division       | `/`    | Divides the first number by the second                            | `12/5` is `2` |
| Multiplicative | Modulus        | `%`    | Finds the remainder after dividing the first number by the second | `12%6` is `0` |

**Type matching:** both operands must be the same type — both `int`, both `float`, or both `double`.
**Integer vs. decimal division:** dividing an `int` by an `int` keeps only the whole part; dividing a `float`/`double` by a `float`/`double` keeps the decimal part too. This makes `float`/`double` more accurate for some operations:

```java
5/2      // 2
5.0/2.0  // 2.5
```

---
# 3.3 - Assignment Operators

| Name                  | Symbol | Example                | Operation                                                 |
| --------------------- | ------ | ---------------------- | --------------------------------------------------------- |
| Assignment            | `=`    | `x = 5;`               | Assigns the value on the right to the left                |
| Addition Equals       | `+=`   | `x += 5;` ≡ `x = x+5;` | Adds both operands, assigns the result to the left        |
| Subtraction Equals    | `-=`   | `x -= 2;` ≡ `x = x-2;` | Subtracts right from left, assigns the result to the left |
| Multiplication Equals | `*=`   | `x *= 2;` ≡ `x = x*2;` | Multiplies both operands, assigns the result to the left  |
| Division Equals       | `/=`   | `x /= 2;` ≡ `x = x/2;` | Divides left by right, assigns the result to the left     |
| Modulus Equals        | `%=`   | `x %= 2;` ≡ `x = x%2;` | Assigns the remainder of left ÷ right to the left         |

---
# 3.4 - Relational Operators

| Category   | Name                   | Symbol | Example                               |
| ---------- | ---------------------- | ------ | ------------------------------------- |
| Comparison | Greater Than           | `>`    | `System.out.println(5>3);` → `true`   |
| Comparison | Less Than              | `<`    | `System.out.println(5<3);` → `false`  |
| Comparison | Greater Than or Equals | `>=`   | `System.out.println(5>=5);` → `true`  |
| Comparison | Less Than or Equals    | `<=`   | `System.out.println(5<=3);` → `false` |
| Equality   | Equals                 | `==`   | `System.out.println(5==3);` → `false` |
| Equality   | Not Equals             | `!=`   | `System.out.println(5!=3);` → `true`  |

---
# 3.5 - Logical Operators

| Name        | Symbol | Operation                                                  | Example                                        |
| ----------- | ------ | ---------------------------------------------------------- | ---------------------------------------------- |
| Logical AND | `&&`   | `true` only if both operands (before and after) are `true` | `System.out.println(5>3 && 2<3);` → `true`     |
| Logical OR  | `\|\|` | `true` if at least one operand is `true`                   | `System.out.println(5<3 \|\| 2!=2);` → `false` |
| Logical NOT | `!`    | Reverses the logical value of the operand on its right     | `System.out.println(!(2==3));` → `true`        |

---
# 3.6 - Bitwise Operators
Similar to logical operators, but bitwise operators work on both `int` and `boolean` types (except Bitwise Complement, which only works on `boolean`). If the operands are `int`, the result is `int`; if `boolean`, the result is `boolean`.
The key difference from logical operators is **short-circuiting**: `&&` skips evaluating the second operand if the first is `false`, and `||` skips it if the first is `true`. Bitwise operators always evaluate both operands regardless of the first operand's value.

| Name                 | Symbol | Operation                                                         | Example                                                                                |
| -------------------- | ------ | ----------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Bitwise AND          | `&`    | Performs binary AND                                               | `System.out.println(8 & 7);` → `0`<br>`System.out.println(false & true);` → `false`    |
| Bitwise Exclusive OR | `^`    | `true` if exactly one operand is `true`, otherwise `false`        | `System.out.println(8 ^ 7);` → `15`<br>`System.out.println(true ^ false);` → `true`    |
| Bitwise Inclusive OR | `\|`   | Performs binary OR                                                | `System.out.println(9 \| 7);` → `15`<br>`System.out.println(false \| true);` → `false` |
| Bitwise Complement   | `~`    | Returns the two's complement of the value (`boolean` only, unary) | `System.out.println(~5);` → `-6`                                                       |

---
# 3.7 - Unary Operators
Unary operators act on a single operand, mainly used for counting. There are two variations for increment/decrement:
- **Prefix** — the value is changed first, then assigned.
- **Postfix** — the value is assigned first, then changed.

| Type | Name | Symbol | Operation | Example |
|---|---|---|---|---|
| Prefix | Negation | `-` | Negates an operand | `x=5; y=-x;` → `y` is `-5` |
| Prefix | Not | `!` | Reverses the logical value of an operand | `x=!true;` → `x` is `false` |
| Prefix | Increment | `++` | Increments the operand by 1 (before assignment) | `x=5; y=++x;` → `x` and `y` are both `6` |
| Prefix | Decrement | `--` | Decrements the operand by 1 (before assignment) | `x=5; y=--x;` → `x` and `y` are both `4` |
| Postfix | Increment | `++` | Increments the operand by 1 (after assignment) | `x=5; y=x++;` → `x` is `6`, `y` is `5` |
| Postfix | Decrement | `--` | Decrements the operand by 1 (after assignment) | `x=5; y=x--;` → `x` is `4`, `y` is `5` |

---
# 3.8 - Operator Precedence
Precedence is highest at the top of the table and decreases moving down. Operators of equal precedence placed adjacently are evaluated left to right. Parentheses `()` are always evaluated innermost-first, working outward.

| Operator Type | Category / Name          | Symbol                            |
| ------------- | ------------------------ | --------------------------------- |
| Unary         | Postfix                  | `++`, `--`                        |
| Unary         | Prefix                   | `++`, `--`, `!`, `-`              |
| Arithmetic    | Multiplicative           | `*`, `/`, `%`                     |
| Arithmetic    | Additive                 | `+`, `-`                          |
| Relational    | Comparison               | `<`, `>`, `<=`, `>=`              |
| Relational    | Equality                 | `==`, `!=`                        |
| Bitwise       | Bitwise AND              | `&`                               |
| Bitwise       | Bitwise Exclusive OR     | `^`                               |
| Bitwise       | Bitwise Inclusive OR     | `\|`                              |
| Logical       | Logical AND              | `&&`                              |
| Logical       | Logical OR               | `\|\|`                            |
| Assignment    | All assignment operators | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |

**Worked examples:**
```java
System.out.println(5*(5+5/5%(5*5)));       // 30 — 5*5 executed first, then 5/5
System.out.println(5+1==(5+5/5%(5*5)));     // true
System.out.println(-(-5-1)==(5+5/5%(5*5))); // true — -5-1 and 5*5 executed first
System.out.println(5!=5 && 5%1!=1 || 1==(5/2)); // true
```
When operators of the same precedence sit next to each other, such as `5/5*5`, evaluation goes left to right — division first, then multiplication.

---
# 3.9 - Worksheet
### A. Trace the code and write the output for each line.
```java
class A {
  public static void main(String[] args) {
    int x = 5;   // Value of x is 5
    int y = 7;   // Value of y is 7
    System.out.println(x);   // Print current value of x
    System.out.println(y);   // Print current value of y
    x -= 1; //x=4
    y += 1; //y=8
    System.out.println(x); //output:4
    System.out.println(y); //output:8
    x = ++y; //x=9,y=9
    y = x--; //x=8.y=9
    System.out.println(x); //output:8
    System.out.println(y); //output:9
    System.out.println(x == y); //output:false
    System.out.println(x % y == 4 * 2); //output:true
    System.out.println(x & y); //output:8 
    System.out.println(x | y); //output:9
    x = -x; //x=-8
    System.out.println(x); //output:-8
    x = ~x; //x=7
    System.out.println(x); //output:7
    y *= x; //y=63
    System.out.println(y); //output:63 
    System.out.println(x % 2 == 1 && y % 2 != 0); //true
  }
}
```
### B. Short answer
1. What is the difference between bitwise operators and logical operators?
2. What is the output of the following lines? Why do the values of `x` and `y` differ?
```java
int x = 5;
int y = 7;
y = ++x; //x=6, y=6
x = y--; //x=6, y=5
System.out.println(x); //6
System.out.println(y); //5
```
**Ans:**
 **Bitwise vs. logical operators:** Bitwise operators (`&`, `|`, `^`, `~`) always evaluate both operands regardless of the first operand's value, and work on both `int` and `boolean` types. Logical operators (`&&`, `||`, `!`) short-circuit — `&&` skips the second operand if the first is `false`, and `||` skips it if the first is `true` — and they only work on `boolean` values.
