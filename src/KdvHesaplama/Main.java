package KdvHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hesaplanmasını istediğin tutarı giriniz:");
        Scanner input=new Scanner(System.in);
        double tutar;
        tutar=input.nextInt();


        if (tutar>0 & tutar<1000){
            double kdv=tutar/100*18;
            double kdvSonucu=tutar-kdv;
            System.out.println("Paranızın %18 KDV'si : "+kdv);
            System.out.println("Kalan ana paranız : "+kdvSonucu);
        }

        else {
            double kdv=tutar/100*8;
            double kdvsonucu=tutar-kdv;
            System.out.println("Paranızın %8 KDV'si : "+ kdv);
            System.out.println("Kalan ana paranız : "+ kdvsonucu);
        }






    }
}


