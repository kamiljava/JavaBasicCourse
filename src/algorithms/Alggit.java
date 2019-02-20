package algorithms;

public class Alggit {
    public int power(int x, int y){
        // 2
        int result = 1;
        // 3
        for(int i = 1; i <= y; i++ ){
            result = result * x;
        }
        return result;
    }
    // algorytm silnia z n
    public int factorial(int n){
        // 2
        int result = 1;
        // 3
        for(int i = n; i > 1; i--){
            result = result * i;
        }
        return result;
    }
    // algorytm ciągu geometrycznego
    public int geoSequence(int a0, int q, int n){
        int sum = 0;
        for(int i = 0; i <= n-1; i++){
            sum = sum + (a0 * power(q, i));
        }
        return sum;
    }
    // algorytm ciągu arytmetycznego
    public int algSequence(int a0, int r, int n){
        int sum = 0;
        for(int i = 0; i <= n-1; i++){
            sum = sum + (a0 + i*r);
        }
        return sum;
    }
    public boolean perfectNumber(int num){
        int sum = 0;
        for (int i = 1;i<num; i++){
            if (num % i ==0){
                sum=sum+i;
            }
        }
        return num ==sum ? true : false;
    }
    public int getNWD(int x, int y) {
        //sprawdzanie wiekszej i mniejszej
        int less = x;
        int greather = y;
        if (x > y) {
            less = y;
            greather = x;
        }
        //Iterujemy w petli i sprawdzany czy dzielnik less jest tez dzielnikiem greather
        for (int i = less; less > 1; i--) {
            if (less % i == 0 && greather % i == 0) {
                return i;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Alggit a = new Alggit();
        System.out.println("Wynik potęgowania: " + a.power(3,4));
        System.out.println("Wynik silni: " + a.factorial(4));
        System.out.println("Suma cg: " + a.geoSequence(2,2,4));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
        System.out.println("Czy liczba jest doskonałą : " + a.perfectNumber(11));
        System.out.println("Czy liczba jest doskonałą : " + a.perfectNumber(28));
        System.out.println("NWD: " + a.getNWD(12,9));
        System.out.println("NWD: " + a.getNWD(11,13));
    }
}
