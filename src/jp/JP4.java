package jp;

public class JP4 {
    public static void main(String[] args) {

        String ala = "ALA MA KOT A KOT MA ALE";

        String ala2 [] = ala.split(" ");
        System.out.println(ala2[0]);
        System.out.println(ala2[1]);
        System.out.println(ala2[2]);
        System.out.println(ala2[3]);
        System.out.println(ala2[4]);
        System.out.println(ala2[5]);
        System.out.println(ala2[6]);

        for(String ala3 : ala2){
            System.out.println(ala3);
        }
    }

}
