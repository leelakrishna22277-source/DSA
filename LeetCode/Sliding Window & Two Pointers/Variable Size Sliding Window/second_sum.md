# Problem Statement

You are given an integer array `arr` and an integer `k`.

The value `1` is considered a special value.

Find the length of the longest contiguous subarray that contains at most `k` occurrences of the value `1`.

---

## Test Case 1

### Input

```java
arr = {1,2,0,1,2,3,1,1,6,7,2,0,1,2}
k = 2
```

### Output

```text
8
```

### Explanation

Longest valid subarray:

```text
[2,3,1,1,6,7,2,0]
```

Length = 6

---

## Test Case 2

### Input

```java
arr = {0,1,0,1,0,1,0}
k = 2
```

### Output

```text
5
```

### Explanation

Longest valid subarray:

```text
[0,1,0,1,0]
```

Length = 5

---

## Code

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,0,1,2,3,1,1,6,7,2,0,1,2};

        int l = 0;
        int ones = 0;
        int k = 2;
        int ans = 0;

        for (int r = 0; r < arr.length; r++) {

            if (arr[r] == 1) {
                ones++;
            }

            while (ones > k) {

                if (arr[l] == 1) {
                    ones--;
                }

                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        System.out.println(ans);
    }
}
```
