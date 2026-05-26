# Variable Size Sliding Window

## Problem Statement

You are given an integer array `arr` and an integer `k`.

Find the length of the longest contiguous subarray that contains at most `k` odd numbers.

---

## Test Case 1

### Input

```java
arr = {12,13,1,1,6,7,1,8,1}
k = 3
```

### Output

```text
5
```

### Explanation

Longest valid subarray:

```text
[12,13,1,1,6]
```

Odd numbers:

```text
13, 1, 1
```

Number of odd elements = 3

Length = 5

---

## Test Case 2

### Input

```java
arr = {2,4,1,6,3,8,10}
k = 2
```

### Output

```text
7
```

### Explanation

Entire array is valid.

Odd numbers:

```text
1, 3
```

Number of odd elements = 2

Length = 7

---

## Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {12,13,1,1,6,7,1,8,1};

        int count = 0;
        int n = arr.length;
        int ans = 0;
        int l = 0;
        int k = 3;

        for (int r = 0; r < n; r++) {

            if (arr[r] % 2 != 0) {
                count++;
            }

            while (count > k) {

                if (arr[l] % 2 != 0) {
                    count--;
                }

                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        System.out.println(ans);
    }
}
```

---

## Approach

1. Expand the window using the right pointer `r`.
2. Count odd numbers in the current window.
3. If odd count becomes greater than `k`, shrink the window from the left.
4. Update the maximum valid window length.

---

## Time Complexity

```text
O(n)
```

Each element enters and leaves the window at most once.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.
