package math;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Math1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosć zmiennej a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj wartosć zmiennej b: ");
        int b = scanner.nextInt();
        //scanner.close();

        System.out.println(0.5*a*(a *sqrt(3)/2));

        System.out.println( pow(a,b));

        int grade1 = 5;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println((double) (grade1 + grade2 + grade3)/3);

        System.out.println(a*b);
        System.out.println("Podaj kwotę netto: ");
        double salary_net = scanner.nextDouble();
        scanner.close();
        int vat_tax = 23;

        System.out.println(salary_net * (1 + (double)vat_tax/100));

        System.out.printf("%.2fzl brutto \n ",salary_net * (1 + (double)vat_tax/100) );
    }
}
