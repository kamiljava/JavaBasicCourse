package jp;

import java.util.Random;

public class Matrix {
    //liczba kolumn i rekordów

    int columns;
    int records;
    int topBound;
    int bottomBound;
    //tablice jednowymiarowe o długosci zadeklarowanych kolumn do przechowywania max'ów i min'ów;
    int maxValue[];
    int minValue[];

    //tablica docelowa z zadania
    int matrix[][];

    public Matrix(int columns, int records, int topBound, int bottomBound) {
        this.columns = columns;
        this.records = records;
        this.topBound = topBound;
        this.bottomBound = bottomBound;
        this.maxValue = new int[columns];
        this.minValue = new int[columns];
        this.matrix = new int[records][columns];
        setMatrix();
        getMAX_MIN();
    }

    public void setMatrix() {
        Random random = new Random();
        //pętla w pętli zapisuje losowe wartości w matrixie
        for (int i = 0; i < records; i++) {
            //(random.nextInt(11)-5)
            for (int j = 0; j < columns; j++) {
                //obicza
                matrix[i][j] = (random.nextInt(topBound - bottomBound + 1) + bottomBound);
            }
        }
    }

    public void getMAX_MIN() {
        //Zapisujemy w tablicy Max najniższą wartość (bottomBound) dla wszystkich indexów, a dla min najwyższą (topBound)
        for (int i = 0; i < columns; i++) {
            maxValue[i] = bottomBound;
            minValue[i] = topBound;
        }

        //sprawdzamy max i min
        for (int i = 0; i < records; i++) {
            for (int j = 0; j < columns; j++) {
                maxValue[j] = matrix[i][j] > maxValue[j] ? matrix[i][j] : maxValue[j];
                minValue[j] = matrix[i][j] < minValue[j] ? matrix[i][j] : minValue[j];

                System.out.print(matrix[i][j] + "\t\t");

            }
            System.out.println();
        }
        //Wyświetlamy maxy
        System.out.println("\nMAX");
        for (int e : maxValue) {
            System.out.print(e + "\t\t");
        }

        //Wyświetlamy minima
        System.out.println("\n\nMIN");
        for (int e : minValue) {
            System.out.print(e + "\t\t");
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix (10, 5,25,-5);
    }
}
