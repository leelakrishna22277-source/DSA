# Rightmost Occurrence Using Binary Search

# Problem Statement

Given a sorted array containing duplicate elements and a target value, return the index of the rightmost occurrence of the target element.

---

# Example

## Input

```java id="q4m8tx"
arr = {1,2,3,3,3,5}
target = 3
```

## Output

```java id="v7n2wp"
4
```

---

# Explanation

The target element:

```java id="m3q8ry"
3
```

appears multiple times in the array.

Array:

```java id="x5v1kt"
{1,2,3,3,3,5}
```

Indexes of `3`:

| Index | Value |
| ----- | ----- |
| 2     | 3     |
| 3     | 3     |
| 4     | 3     |

The rightmost occurrence is at index:

```java id="t8m4qs"
4
```

---

# Program

```java id="n6x2kp"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int bsrightmost(int[] arr, int target) {

        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            // Target found
            // Move right side

            if(target == arr[mid]) {
                l = mid + 1;
            }

            // Search right half

            else if(target > arr[mid]) {
                l = mid + 1;
            }

            // Search left half

            else {
                r = mid - 1;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,5};

        int target = 3;

        int ans = bsrightmost(arr, target);

        System.out.println(ans);
    }
}
```

---

# Output

```text id="k9v4rm"
4
```

---

# Dry Run

## Iteration 1

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 0 | 5 | 2   | 3        |

Target found.

Move right:

```java id="w3n8qt"
l = mid + 1
l = 3
```

---

## Iteration 2

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 3 | 5 | 4   | 3        |

Target found.

Move right:

```java id="m7q2vx"
l = mid + 1
l = 5
```

---

## Iteration 3

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 5 | 5 | 5   | 5        |

Since:

```java id="r1v9kp"
3 < 5
```

Move left:

```java id="x6m4wy"
r = mid - 1
r = 4
```

Now:

```java id="j8q3tn"
l = 5
r = 4
```

Loop stops because:

```java id="v2m7rs"
l > r
```

Return:

```java id="p5x1kq"
r = 4
```

---

# Note

If we want the rightmost occurrence:

```java id="f4v8mz"
Move positions until l > r
```

and return:

```java id="u7q2wp"
return r
```

Because after the loop:

| Variable | Meaning                             |
| -------- | ----------------------------------- |
| `r`      | rightmost position of target        |
| `l`      | one position after rightmost target |

---

# Time Complexity

Binary Search Time Complexity:

O(\log n)

because the search space becomes half in every iteration.

---

# Space Complexity

```java id="y9m4kt"
O(1)
```

because no extra space is used.
