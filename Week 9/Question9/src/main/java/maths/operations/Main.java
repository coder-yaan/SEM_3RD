package maths.operations;
public class Main {
    public static void main(String[] args) {
        int a = 48, b = 18;
        int gcd = MathOperations.findGCD(a, b);
        int lcm = MathOperations.findLCM(a, b);
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}