package start;

public class Variables {

    public static void main(String[] args) {
        int x = 0;

        System.out.println(x);

        int y = x + 11;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        System.out.println("KLASA STRING");
        String word = "Lorem ipsun Lorem ipsum";
        //szukanie po wartosci
        System.out.println(word.indexOf("s"));
        //szukanie po indexie
        System.out.println(word.charAt(8));
        System.out.println(word.length());
        //Porównanie
        String word2 = "Header";

        System.out.println(word.equals((word2)));
        System.out.println(word2.equals("header"));
        System.out.println(word2.equals("Header"));
        System.out.println(!word2.equals(word));
        //wydobywanie podciągu
        System.out.println(word.contains("ipsun"));
        System.out.println(word.substring(6,11));
        System.out.println(word.substring(6,11).length());
        int myStringLen = word.substring(6,11).length();
        System.out.println("myStringLen = " + myStringLen);
        //dzielenie slow
        String words [] = word.split(" ");  //split dzieli na tablice
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);



    }
}
