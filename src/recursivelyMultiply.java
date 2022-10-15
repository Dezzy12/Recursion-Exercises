//Java function that takes in two numbers and recursively multiplies them together.
public class recursivelyMultiply {
    public static int product(int x, int y) { //Recursive method used to multiply given numbers
        if (x < y) { //swaps the numbers in cases where x is less than y
            return product(y, x);
        } else if (y != 0) { //iteratively calculate y times the sum of x
            return (x + product(x, y - 1));
        } else {
            return 0;
        }
    }

    //Driver method
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println(product(x, y));
    }
}

