import java.util.Scanner;

public class exercise1 {

    // Method to check and return the number if it is odd, otherwise return 0
    public static int oddSum(int n) {
        if (n % 2 != 0) {
            int sum = 0;
            sum = sum + n;
            return sum;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many no you want to enter:");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("enter numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + oddSum(num);  // add only odd numbers
        }

        sc.close();

        System.out.println("addition of odd number are " + sum);
    }
}
