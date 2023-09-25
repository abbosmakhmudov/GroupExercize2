public class T2ReversedString {
    public static void main(String[] args) {
        String input="Hello";
         String reverse="";
        for (int i = input.length(); i <=0 ; i--) {
            reverse=reverse+input.charAt(i);
        }
        System.out.println(reverse);
    }
}
