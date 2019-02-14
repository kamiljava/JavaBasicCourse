package jp;

public class JP3 {

    public static void main(String[] args) {

        String var1,var2,var3,var4;

        var1 = "java";
        var2 = "test";
        var3 = var1 +  var2;
        var4 = var3 + "AAA";

        System.out.println("VAR3: "+ var3.toUpperCase());
        System.out.println("VAR4: "+ var4.toLowerCase());

        System.out.println(var4.length());
        System.out.println("Index 2: "+ var3.charAt(2));
        System.out.println("Index 5: " +var3.charAt(5));
        System.out.println(var4.charAt(var4.length()-3));
        System.out.println("VAR1 substr: " + var4.substring(0,4));
        System.out.println("VAR2 substr: " + var4.substring(4,8));







    }
}
