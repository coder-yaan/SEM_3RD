package maths;
class Maths {
    public static void minMaxAdd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = a + b;
        System.out.println("Integers: min=" + min + ", max=" + max + ", sum=" + sum);
    }
    public static void minMaxAdd(double a, double b) {
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        double sum = a + b;
        System.out.println("Real numbers: min=" + min + ", max=" + max + ", sum=" + sum);
    }
    public static void minMaxAdd(char a, char b) {
        char min = (a < b) ? a : b;
        char max = (a > b) ? a : b;
        int sum = a + b;
        System.out.println("Characters: min=" + min + ", max=" + max + ", sum of ASCII=" + sum);
    }
}