/* Problem: Create a final class MathUtils with a method to calculate the factorial of a number.

[code:]
------------------------------------------------------
final class MathUtils {
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
