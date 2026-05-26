# Variable Size Sliding Window

## Problem Statement

You are given a binary array `arr` containing only `0`s and `1`s, and an integer `k`.

Find the length of the longest contiguous subarray such that the count of the less frequent element (either `0` or `1`) in the current window does not exceed `k`.

In other words, for every valid window:

```text
min(number of 0s, number of 1s) <= k
```

Return the maximum length of such a window.

---

## Test Case 1

### Input

```java
arr = {1,0,1,1,0}
k = 1
```

### Output

```text
4
```

### Explanation

Valid longest subarray:

```text
[1,0,1,1]
```

Counts:

```text
ones = 3
zeros = 1
min(3,1) = 1
```

Since:

```text
1 <= k
```

the window is valid.

Length:

```text
4
```

---

## Test Case 2

### Input

```java
arr = {1,1,0,0,1,1}
k = 1
```

### Output

```text
3
```

### Explanation

One valid longest subarray:

```text
[1,1,0]
```

Counts:

```text
ones = 2
zeros = 1
min(2,1) = 1
```

Length:

```text
3
```

The entire array is not valid because:

```text
ones = 4
zeros = 2
min(4,2) = 2 > 1
```

---

## Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {1,0,1,1,0};

        int n = arr.length;
        int ans = 0;
        int ones = 0;
        int zeros = 0;
        int l = 0;
        int k = 1;

        for(int r = 0; r < n; r++) {

            if(arr[r] == 1) {
                ones++;
            } else {
                zeros++;
            }

            while(Math.min(ones, zeros) > k) {

                if(arr[l] == 1) {
                    ones--;
                } else {
                    zeros--;
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
