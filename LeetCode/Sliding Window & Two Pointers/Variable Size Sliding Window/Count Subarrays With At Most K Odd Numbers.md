# Count Subarrays With At Most K Odd Numbers

## Problem Statement

Given an integer array `nums` and an integer `k`, find the total number of subarrays that contain **at most `k` odd numbers**.

---

## Example

```java
nums = [2,1,3]
k = 1
```

Output:

```java
4
```

Valid subarrays:

```java
[2]
[2,1]
[1]
[3]
```

---

# Code

```java
class Main {
    public static void main(String[] args) {

        int[] nums = {2,1,3};
        int k = 1;

        int n = nums.length;

        int l = 0;
        int sum = 0;
        int ans = 0;

        for(int r = 0; r < n; r++) {

            // Count odd numbers
            if(nums[r] % 2 == 1) {
                sum++;
            }

            // Shrink window if odd count becomes greater than k
            while(sum > k) {

                if(nums[l] % 2 == 1) {
                    sum--;
                }

                l++;
            }

            // Count valid subarrays
            ans += r - l + 1;

            System.out.println(l + " " + r);
        }

        System.out.println(ans);
    }
}
```

---

# Dry Run

## Input

```java
nums = [2,1,3]
k = 1
```

---

## Step 1

### r = 0

Element:

```java
2
```

Odd count:

```java
0
```

Window:

```java
[2]
```

Possible valid subarrays ending at index 0:

```java
[2]
```

Count:

```java
1
```

Formula:

```java
r - l + 1
= 0 - 0 + 1
= 1
```

ans:

```java
1
```

---

## Step 2

### r = 1

Element:

```java
1
```

Odd count:

```java
1
```

Window:

```java
[2,1]
```

Possible valid subarrays ending at index 1:

```java
[2,1]
[1]
```

Count:

```java
2
```

Formula:

```java
r - l + 1
= 1 - 0 + 1
= 2
```

ans:

```java
1 + 2 = 3
```

---

## Step 3

### r = 2

Element:

```java
3
```

Odd count becomes:

```java
2
```

This is greater than `k`.

So move `l`.

Remove:

```java
2
```

Still odd count = 2

Move again.

Remove:

```java
1
```

Odd count becomes:

```java
1
```

Now:

```java
l = 2
```

Window:

```java
[3]
```

Possible valid subarrays ending at index 2:

```java
[3]
```

Count:

```java
1
```

Formula:

```java
r - l + 1
= 2 - 2 + 1
= 1
```

ans:

```java
3 + 1 = 4
```

---

# Final Answer

```java
4
```

---

# Why ans += r - l + 1 ?

Suppose:

```java
l = 2
r = 5
```

Window:

```java
[2.....5]
```

All subarrays ending at `r` are:

```java
[5]
[4,5]
[3,4,5]
[2,3,4,5]
```

Number of subarrays:

```java
4
```

Formula:

```java
r - l + 1
= 5 - 2 + 1
= 4
```

---

# Important Concept

When the window is valid:

```java
sum <= k
```

then every smaller subarray inside that window is also valid.

So we directly count all subarrays ending at `r`.

---

# Test Case 1

## Input

```java
nums = [2,2,1]
k = 1
```

## Valid Subarrays

```java
[2]
[2,2]
[2,2,1]
[2]
[2,1]
[1]
```

## Output

```java
6
```

---

# Test Case 2

## Input

```java
nums = [1,1,2]
k = 1
```

## Valid Subarrays

```java
[1]
[1]
[1,2]
[2]
```

## Output

```java
4
```

---

# Time Complexity

```java
O(n)
```

Each element is visited at most two times.

---

# Space Complexity

```java
O(1)
```
