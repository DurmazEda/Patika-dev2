import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r , a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapına giriniz:");
        r = input.nextInt();
        System.out.println("Açısını giriniz:");
        a = input.nextInt();

        double alan = (pi * (r*r)*a)/360;

        System.out.println("Dairenin dilim alanı:"+ alan);
    }

}
