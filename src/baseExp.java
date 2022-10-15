//Java function that takes in a base and an exp and recursively computes base exp . You are not allowed to
//use the ** operator!
public class baseExp {
    public static int power(int base, int exp) {
        if (exp != 0) {
            //Recursively calling power()
            return (base * power(base, exp - 1));
        } else {
            return 1;
        }
    }

    //Driver method
    public static void main(String[] args) {
        int base = 3, exp = 3;
        System.out.println(power(base, exp));
    }
}
