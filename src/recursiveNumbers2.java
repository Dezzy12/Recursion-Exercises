//Java function using recursion to print numbers from 0 to n
public class recursiveNumbers2 {
    public static int print(int n) {
        if (n > 0) {
            print(n - 1);
        }
        System.out.println(n);
        return 0;
    }

    //Driver method
    public static void main(String[] args) {
        print(10);
    }
}
