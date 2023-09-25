import java.util.Locale;

public class T7StringWithA {
    /*
    You have a list of strings, and you want to keep only those that start
    with “A” and you want to return them in lower case.
     */
    public static void main(String[] args) {
        String name1="Abbas";
        String name2="Ali";
        String name3="Osman";
        String name4="Omar";

        String [] names={name1,name2,name3,name4};
        for (int i = 0; i <names.length ; i++) {
            if(names[i].startsWith("A")){
                System.out.println(names[i].toLowerCase());
            }
        }
    }
}
