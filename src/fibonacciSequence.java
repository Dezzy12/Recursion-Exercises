//Write a recursive function that takes in one argument n and computes F n , the n th value of the Fibonacci
//sequence.
public class fibonacciSequence {
    public static int fibonacci(int n) {
        //Base case
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    //Driver method
    public static void main(String[] args) {
        int num = 10;
        System.out.print("The Fibonacci series of " + num + " numbers is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
