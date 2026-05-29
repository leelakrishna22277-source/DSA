# Leftmost Occurrence Using Binary Search

# Problem Statement

Given a sorted array containing duplicate elements and a target value, return the index of the leftmost occurrence of the target element.

---

# Example

## Input

```java id="u4m8kx"
arr = {1,2,3,3,3,5}
target = 3
```

## Output

```java id="g7q2vn"
2
```

---

# Explanation

The target element:

```java id="a5n9wr"
3
```

appears multiple times in the array.

Array:

```java id="t8m4qy"
{1,2,3,3,3,5}
```

Indexes of `3`:

| Index | Value |
| ----- | ----- |
| 2     | 3     |
| 3     | 3     |
| 4     | 3     |

The leftmost occurrence is at index:

```java id="w1v7ps"
2
```

---

# Program

```java id="d6x3kt"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int bsleftmost(int[] arr, int target) {

        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            // Target found
            // Move left side

            if(target == arr[mid]) {
                r = mid - 1;
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

        return l;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,5};

        int target = 3;

        int ans = bsleftmost(arr, target);

        System.out.println(ans);
    }
}
```

---

# Output

```text id="m9q4ts"
2
```

---

# Dry Run

## Iteration 1

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 0 | 5 | 2   | 3        |

Target found.

Move left:

```java id="k4v8zp"
r = mid - 1
r = 1
```

---

## Iteration 2

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 0 | 1 | 0   | 1        |

Since:

```java id="p6n2wx"
3 > 1
```

Move right:

```java id="q8m5ry"
l = mid + 1
l = 1
```

---

## Iteration 3

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 1 | 1 | 1   | 2        |

Since:

```java id="x3v9kt"
3 > 2
```

Move right:

```java id="n7q4wy"
l = mid + 1
l = 2
```

Now:

```java id="z5m1rp"
l = 2
r = 1
```

Loop stops because:

```java id="w2k8vs"
l > r
```

Return:

```java id="j9t4nx"
l = 2
```

---

# Note

If we want the leftmost occurrence:

```java id="c7m2qy"
Move positions until r < l
```

and return:

```java id="v4p8ks"
return l
```

Because after the loop:

| Variable | Meaning                             |
| -------- | ----------------------------------- |
| `l`      | leftmost position of target         |
| `r`      | one position before leftmost target |

---

# Time Complexity

Binary Search Time Complexity:

O(\log n)

because the search space becomes half in every iteration.

---

# Space Complexity

```java id="r8v3wp"
O(1)
```

because no extra space is used.
