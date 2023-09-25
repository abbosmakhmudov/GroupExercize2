public class T1Swap2Strings {
    public static void main(String[] args) {
        String var1="Hello";
        String var2="Good Morning";

        StringBuilder b1=new StringBuilder(var1);
        var1=var2;
        var2=b1.toString();

        System.out.println("Variable1= "+var1);
        System.out.println("variable2= "+var2);

    }
}
