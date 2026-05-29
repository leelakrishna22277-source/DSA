# Simplification Note

In leftmost and rightmost binary search problems, we can remove one extra `else if` condition because both cases perform the same operation.

Example:

```java id="w7m3qx"
if(target == arr[mid]) {
    l = mid + 1;
}
else if(target > arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

Here:

```java id="u4n8pk"
target == arr[mid]
```

and

```java id="t9q2ws"
target > arr[mid]
```

both move towards the right side:

```java id="r6m1vx"
l = mid + 1;
```

So both conditions can be combined.

Simplified code:

```java id="x5v7kp"
if(target >= arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

Similarly for leftmost occurrence:

```java id="c3m9qt"
if(target > arr[mid]) {
    l = mid + 1;
}
else {
    r = mid - 1;
}
```

because:

```java id="f8q4wn"
target == arr[mid]
```

and

```java id="m2v7ks"
target < arr[mid]
```

both move towards the left side:

```java id="n5x1pr"
r = mid - 1;
```

So extra condition can be removed to make the code shorter and cleaner.
