# Search Insert Position Using Binary Search

# Problem Statement

Given a sorted array of distinct integers and a target value that is not present in the array, return the index where the element should be inserted to maintain sorted order.

---

# Example

## Input

```java id="y7m3pa"
arr = {1,3,5,7,10}
target = 6
```

## Output

```java id="f4x8ke"
3
```

## Explanation

The target element:

```java id="z2n6rt"
6
```

is not present in the array.

Current array:

```java id="m9q4ls"
{1,3,5,7,10}
```

`6` should be inserted before `7`.

After insertion:

```java id="v7d1pk"
{1,3,5,6,7,10}
```

So insertion index is:

```java id="n6t2yw"
3
```

---

# Program

```java id="q5v9rh"
class Main {

    public static int bs(int[] arr, int target) {

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

            // Target is not present
            // Return insertion position

            if(r < l) {
                return l;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,10};

        int target = 6;

        int ans = bs(arr, target);

        System.out.println(ans);
    }
}
```

---

# Output

```text id="y8r4zw"
3
```

---

# Dry Run

## Iteration 1

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 0 | 4 | 2   | 5        |

Since:

```java id="x5c8vp"
6 > 5
```

Move right:

```java id="u3w1kt"
l = mid + 1
l = 3
```

---

## Iteration 2

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 3 | 4 | 3   | 7        |

Since:

```java id="w4e9ny"
6 < 7
```

Move left:

```java id="c7t2qs"
r = mid - 1
r = 2
```

Now:

```java id="n0m6rx"
r < l
2 < 3
```

So the target is not present.

Return:

```java id="j8v4ph"
l = 3
```

---

# Time Complexity

Binary Search Time Complexity:

O(\log n)

because the search space becomes half in every iteration.

---

# Space Complexity

```java id="q4m9ye"
O(1)
```

because no extra space is used.
