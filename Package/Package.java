/* Problem: Create a package named com.example.util and place the MathUtils class inside it.

----------------------------------------
[code]:

package com.example.util;

final class MathUtils {
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
