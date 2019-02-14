package jp;

public class JP7 {
    public static void main(String[] args) {

        String name = "Jowita";
        name = name.toUpperCase();
        String  name2 = "Ania";

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A'? "kobieta" : "mezczyzna");
        //System.out.println(name2.toUpperCase().charAt(name2.length()-1) == 'A'? "kobieta" : "mezczyzna");

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' && !name.equals("KUBA") && !name.equals("BARNABA")
                ? "kobieta" : "mężczyzna");


        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' && !name.equals("KUBA") && !name.equals("BARNABA")
                ? "kobieta" : "mężczyzna");


    }

}
