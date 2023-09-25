import java.util.Arrays;

public class T5Anagrams {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String var1="listen";
        String var2="silent";
        char [] arr1=var1.toCharArray();
        char [] arr2=var2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");

        }


    }
}
