//Java function using recursion that takes in a string and returns a reversed copy of the string.
public class reversedString {
    public static String reverseString(String str){
        if(str.isEmpty()){//checks if the string is empty
            System.out.println("String is empty.");
            return str;
        }else{
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    //Driver method
    public static void main(String[] args){
        reversedString person = new reversedString();
        String name = person.reverseString("DESMOND");
        System.out.println(name);
    }
}
