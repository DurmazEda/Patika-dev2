package Alan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , b, c , u;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.println("1. kenarını giriniz:");
        a = input.nextInt();

        System.out.println("2. kenarını giriniz:");
        b = input.nextInt();

        System.out.println("3. kenarını giriniz");
        c = input.nextInt();

        u = a + b+ c;
        System.out.println("Üçgenin Çevresi:" + u);

        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("üçgenin alanı:"+ alan);




    }

}
