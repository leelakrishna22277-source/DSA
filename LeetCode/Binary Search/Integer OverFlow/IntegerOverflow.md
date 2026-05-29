# Integer Overflow in Java

## What is Integer Overflow?

Integer Overflow happens when a value becomes larger than the maximum value a datatype can store.

For `int` in Java:

2^{31}-1=2147483647

Minimum value:

-2^{31}=-2147483648

If a calculation exceeds this range, Java wraps around and produces an incorrect value.

---

# Complete Program

```java id="6nq7fd"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {

        // Integer range upto 2147483647

        int l = Integer.MAX_VALUE;
        int r = 12;

        int mid = (l + r) / 2;

        System.out.println(l);
        System.out.println(mid);

        System.out.println("=========================");

        // Long range upto 9223372036854775807

        long l1 = Integer.MAX_VALUE;
        long r1 = 12;

        long mid1 = (l1 + r1) / 2;

        System.out.println(l1);
        System.out.println(mid1);

        System.out.println("=========================");

        // Handling Integer Overflow

        int l2 = Integer.MAX_VALUE;
        int r2 = 12;

        int mid2 = l2 + (r2 - l2) / 2;

        System.out.println(l2);
        System.out.println(mid2);
    }
}
```

---

# Output

```text id="3sk4c7"
2147483647
-1073741818
=========================
2147483647
1073741829
=========================
2147483647
1073741830
```

---

# Explanation

## Case 1 : Using int

```java id="sydg79"
int mid = (l + r) / 2;
```

Values:

```java id="uvp0ae"
l = 2147483647
r = 12
```

Addition becomes:

2147483647+12=2147483659

But `int` maximum value is:

2147483647

So Integer Overflow occurs.

Java wraps the number into a negative value.

Therefore output becomes:

```text id="uhkmkh"
-1073741818
```

---

# Case 2 : Using long

```java id="g4bkn1"
long mid1 = (l1 + r1) / 2;
```

`long` supports much larger values.

Maximum value of `long`:

2^{63}-1=9223372036854775807

So overflow does not happen.

Correct output:

```text id="c4w98k"
1073741829
```

---

# Case 3 : Preventing Overflow

```java id="6qf1bh"
int mid2 = l2 + (r2 - l2) / 2;
```

Instead of adding large values first, subtraction happens first.

```java id="8d8wri"
(r2 - l2)
```

produces a smaller intermediate value.

So overflow is avoided.

Correct output:

```text id="97k88n"
1073741830
```

---

# Why Binary Search Uses This Formula

Wrong way:

```java id="5p3m6n"
mid = (l + h) / 2
```

Safe way:

```java id="p49sbr"
mid = l + (h - l) / 2
```

This prevents Integer Overflow in Binary Search.

---

# Time Complexity of Binary Search

Binary Search Time Complexity:

O(\log n)

Because the search space becomes half in every iteration.
