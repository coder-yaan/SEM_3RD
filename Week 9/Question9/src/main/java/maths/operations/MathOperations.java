package maths.operations;
class MathOperations {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
