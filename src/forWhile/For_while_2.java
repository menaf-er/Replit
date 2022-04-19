package forWhile;

import java.util.Scanner;

public class For_while_2 {
    public static void main(String[] args) {
        /*
Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :
30
40

Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int ebob=1;
        int bolenler=2;
        int s1=sayi1;
        int s2=sayi2;
        do {
            if (s1%bolenler==0 && s2%bolenler==0){
                ebob*=bolenler;
                s1/=bolenler;
                s2/=bolenler;
            }else if (s1%bolenler==0){
                s1/=bolenler;
            }else if (s2%bolenler==0){
                s2/=bolenler;
            }else{
                bolenler++;
            }


        }while (bolenler<=sayi1);

        System.out.println(sayi1 +" ve "+ sayi2 +" icin GCD = "+ebob);

        int ekok=1;
        int kBolenler=2;
        int sk1=sayi1;
        int sk2=sayi2;
        do {
            if (sk1%kBolenler==0 && sk2%kBolenler==0){
                ekok*=kBolenler;
                sk1/=kBolenler;
                sk2/=kBolenler;
            }else if (sk1%kBolenler==0){
                ekok*=kBolenler;
                sk1/=kBolenler;
            }else if (sk2%kBolenler==0){
                ekok*=kBolenler;
                sk2/=kBolenler;
            }else {
                kBolenler++;
            }

        }while (kBolenler<=sayi1);

        System.out.println(sayi1+" ve "+sayi2+ " icin LCM = "+ekok);

    }
}
