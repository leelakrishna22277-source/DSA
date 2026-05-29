# Floor Character Using Binary Search

# Problem Statement

Given a sorted character array and a target character, return the greatest character that is smaller than  the target character.

If no such character exists, return `'a'`.

---

# Example

## Input

```java id="k7w2mx"
arr = {'c','e','g','k','y'}
target = 'j'
```

## Output

```java id="r4p9tn"
g
```

---

# Explanation

The target character:

```java id="u8q5vs"
'j'
```

is not present in the array.

Characters smaller than `'j'` are:

```java id="c3n8yp"
'c', 'e', 'g'
```

The greatest character smaller than `'j'` is:

```java id="v1m6rk"
'g'
```

So output is:

```java id="x5b9qw"
g
```

---

# Program

```java id="d6f2ke"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static char bs(char[] arr, char target) {

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

        // No smaller character exists

        if(r < 0) {
            return 'a';
        }

        return arr[r];
    }

    public static void main(String[] args) {

        char[] arr = {'c','e','g','k','y'};

        char target = 'j';

        char ans = bs(arr, target);

        System.out.println(ans);
    }
}
```

---

# Output

```text id="v7k4em"
g
```

---

# Dry Run

## Iteration 1

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 0 | 4 | 2   | g        |

Since:

```java id="e8q2mh"
'j' > 'g'
```

Move right:

```java id="y4p8kn"
l = mid + 1
l = 3
```

---

## Iteration 2

| l | r | mid | arr[mid] |
| - | - | --- | -------- |
| 3 | 4 | 3   | k        |

Since:

```java id="s9m3vt"
'j' < 'k'
```

Move left:

```java id="q2n6wx"
r = mid - 1
r = 2
```

Now:

```java id="m8r1kp"
l = 3
r = 2
```

Loop stops because:

```java id="a6v4ze"
l > r
```

Return:

```java id="u3t9yb"
arr[r]
arr[2]
'g'
```

---

# Special Case

If target is smaller than all characters:

## Example

```java id="z1q7mk"
arr = {'c','e','g'}
target = 'a'
```

Then:

```java id="t4w8ps"
r = -1
```

So return:

```java id="j7v2de"
'a'
```

---

# Time Complexity

Binary Search Time Complexity:

O(\log n)

because the search space becomes half in every iteration.

---

# Space Complexity

```java id="f8x5nm"
O(1)
```

because no extra space is used.
