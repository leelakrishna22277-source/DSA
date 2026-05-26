# Variable Size Sliding Window

## Problem Statement

You are given a binary array `arr` containing only `0`s and `1`s and an integer `k`.

You are allowed to flip at most `k` zeros into ones.

Find the length of the longest contiguous subarray containing only ones after performing at most `k` flips.

---

## Test Case 1

### Input

```java
arr = {1,1,0,1,0,0,0}
k = 2
```

### Output

```text
5
```




---

## Test Case 2

### Input

```java
arr = {1,0,1,1,0,1,1,1}
k = 1
```

### Output

```text
6
```



---

## Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {1,1,0,1,0,0,0};

        int count = 0;
        int n = arr.length;
        int ans = 0;
        int l = 0;
        int k = 2;

        for (int r = 0; r < n; r++) {

            if (arr[r] == 0) {
                count++;
            }

            while (count > k) {

                if (arr[l] == 0) {
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

1. Expand the window using the right pointer.
2. Count the number of zeros in the current window.
3. If zeros become greater than `k`, shrink the window from the left.
4. Track the maximum valid window length.

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
