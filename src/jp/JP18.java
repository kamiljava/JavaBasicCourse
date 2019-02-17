package jp;

public class JP18 {
    public static void main(String[] args) {
        int tab[][] = new int[5][5];

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int maxcol[] = new int[5];
        int mincol[] = new int[5];
        for (int i = 0; i < tab.length; i++) {
            int max = -5;
            for (int j = 0; j < tab.length; j++) {
                int los = (int) (Math.random() * 12 - 6);
                tab[i][j] = los;
                if (i == 0) {
                    maxcol[j] = tab[i][j];
                    mincol[j] = tab[i][j];
                } else {
                    maxcol[j] = Math.max(maxcol[j], tab[i][j]);
                    mincol[j] = Math.min(mincol[j], tab[i][j]);
                }
                if (los < 0) {
                    System.out.print(" " + tab[i][j]);
                } else {
                    System.out.print("  " + tab[i][j]);
                }
            }
//
            System.out.println();
        }
        System.out.println("Maximum");
        for (int maxy : maxcol) {
            System.out.print("  " + maxy);
        }
        System.out.println();

        System.out.println("Minimum");

        for (int miny : mincol) {
            if (miny < 0) {
                System.out.print(" " + miny);
            } else {
                System.out.print("  " + miny);
            }
        }
    }
}
