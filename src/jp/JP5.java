package jp;

public class JP5 {
    public static void main(String[] args) {
//Pierwsze prawo de morgana
        boolean p, q ;
        p = true;
        q = true;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = true;
        q = false;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = false;
        q = true;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = false;
        q = false;
        System.out.println(!(p && q) == ((!p) || (!q)));
    }


}
