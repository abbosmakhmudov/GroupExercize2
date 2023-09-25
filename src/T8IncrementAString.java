public class T8IncrementAString {
    /*
    Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
     */
    public static String Increment(String str){
        int number=Integer.parseInt(str);
        number=number+1;
        return Integer.toString(number);
    }

    public static void main(String[] args) {
        String num1="123";
        String num2="53457";
        String num3="29";
        System.out.println(Increment(num1));
        System.out.println(Increment(num2));
        System.out.println(Increment(num3));

    }

}
