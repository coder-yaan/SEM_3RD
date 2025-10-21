import java.util.Scanner;
public class Two {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        int numsqrt = (int)Math.sqrt(num);
        for(int i = 2; i <= numsqrt; i++){
            if (num % i == 0) {
                isPrime = false; break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
