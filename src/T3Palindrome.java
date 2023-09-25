public class T3Palindrome {
    public static void main(String[] args) {
        String input="ada";
        String reverse="";
        for (int i = input.length(); i <=0 ; i--) {
            reverse=reverse+input.charAt(i);
        }
        if(input.equalsIgnoreCase(reverse)){
            System.out.println("Its Palindrome");
        }else {
            System.out.println("It is not palindrome");
        }
    }
}
