# Leftmost and Rightmost Occurrence Using Binary Search

# Problem Statement

Given a sorted array and a target value:

* Return the leftmost occurrence index of the target.
* Return the rightmost occurrence index of the target.
* If the target is not present in the array, return `-1`.

---

# Example 1

## Input

```java id="u7m2qx"
arr = {1,2,3,3,3,5}
target = 3
```

## Output

```java id="x4n8wp"
Leftmost Occurrence  = 2
Rightmost Occurrence = 4
```

---

# Example 2

## Input

```java id="m9v3kt"
arr = {1,2,3,3,3,5}
target = 8
```

## Output

```java id="t6q1ry"
Leftmost Occurrence  = -1
Rightmost Occurrence = -1
```

---

# Program

```java id="f3x8mp"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    // Leftmost Occurrence

    public static int bsleftmost(int[] arr, int target) {

        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(target > arr[mid]) {
                l = mid + 1;
            }

            else {
                r = mid - 1;
            }
        }

        // Edge Cases

        if(l >= arr.length) {
            return -1;
        }

        if(arr[l] != target) {
            return -1;
        }

        return l;
    }

    // Rightmost Occurrence

    public static int bsrightmost(int[] arr, int target) {

        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(target >= arr[mid]) {
                l = mid + 1;
            }

            else {
                r = mid - 1;
            }
        }

        // Edge Cases

        if(r < 0) {
            return -1;
        }

        if(arr[r] != target) {
            return -1;
        }

        return r;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,5};

        int target = 3;

        int left = bsleftmost(arr, target);

        int right = bsrightmost(arr, target);

        System.out.println("Leftmost Occurrence  = " + left);

        System.out.println("Rightmost Occurrence = " + right);
    }
}
```

---

# Output

```text id="d7m4wp"
Leftmost Occurrence  = 2
Rightmost Occurrence = 4
```

---

# Leftmost Occurrence Logic

For leftmost occurrence:

```java id="v5q8ns"
if(target > arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

We continuously move towards the left side.

After loop:

| Variable | Meaning                      |
| -------- | ---------------------------- |
| `l`      | leftmost position            |
| `r`      | one position before leftmost |

Return:

```java id="m2v9qx"
return l;
```

---

# Rightmost Occurrence Logic

For rightmost occurrence:

```java id="r8m3kt"
if(target >= arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

We continuously move towards the right side.

After loop:

| Variable | Meaning                      |
| -------- | ---------------------------- |
| `r`      | rightmost position           |
| `l`      | one position after rightmost |

Return:

```java id="q4x7wp"
return r;
```

---

# Edge Cases

## Leftmost Edge Cases

```java id="w1n6kr"
if(l >= arr.length) {
    return -1;
}

if(arr[l] != target) {
    return -1;
}
```

These conditions handle:

* target greater than all elements
* target not present in array

---

## Rightmost Edge Cases

```java id="f8q2ms"
if(r < 0) {
    return -1;
}

if(arr[r] != target) {
    return -1;
}
```

These conditions handle:

* target smaller than all elements
* target not present in array

---

# Simplification Note

For leftmost occurrence:

```java id="x9m4vp"
if(target > arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

because:

* `target == arr[mid]`
* `target < arr[mid]`

both move towards left side.

---

For rightmost occurrence:

```java id="n7q3kt"
if(target >= arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

because:

* `target == arr[mid]`
* `target > arr[mid]`

both move towards right side.

---

# Time Complexity

Binary Search Time Complexity:

O(\log n)

because the search space becomes half in every iteration.

---

# Space Complexity

```java id="p5m8wx"
O(1)
```

because no extra space is used.
