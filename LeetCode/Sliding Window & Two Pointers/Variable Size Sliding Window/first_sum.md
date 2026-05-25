# 📘 Variable Size Sliding Window (Concept + Problem + Code)

---

# 🧠 1. Concept of Variable Size Sliding Window

Variable Size Sliding Window is a technique used when:

- Subarray/substring size is **NOT fixed**
- We need to satisfy a **condition (sum, limit, frequency, etc.)**
- Window can **expand and shrink dynamically**

---

---

# 🚌 2. Problem (Bus Weight Example)

## 🚍 Problem Statement

A bus has a maximum weight limit of **10 kg**.

Each passenger has a weight.

You are allowed to pick **consecutive passengers only**.

👉 Find the **maximum number of passengers** that can board the bus without exceeding the weight limit.

---


---

# 💻 3. Code 

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 1, 1};
        int n = arr.length;

        int sum = 0;
        int maxsum = 0;
        int l = 0;
        int k = 10;

        for (int r = 0; r < n; r++) {

            sum += arr[r];

            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            maxsum = Math.max(maxsum, r - l + 1);
        }

        System.out.println(maxsum);
    }
}
