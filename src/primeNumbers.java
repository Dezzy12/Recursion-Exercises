public class primeNumbers {
    public static boolean isPrime(int n, int i) {
        //Base case
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;

        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1); // checking for next divisor
    }

    //Driver method
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        if (isPrime(n, i)) {
            System.out.println("Yes it is a Prime");
        } else {
            System.out.println("Not a prime");
        }
    }
}
