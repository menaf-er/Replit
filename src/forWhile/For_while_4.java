package forWhile;

import java.util.Scanner;

public class For_while_4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=65432*1=720
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi=scan.nextInt();
        int carpim=1;
        System.out.print(sayi+"!=");

        while (sayi>=1 || sayi<=-1){
            if (sayi>0){
                carpim*=sayi;
                if (sayi==1){
                    System.out.print("*1=");
                }else{
                    System.out.print(sayi);
                }

                sayi--;
            }else{
                carpim*=sayi;
                if (sayi==-1){
                    System.out.print("*-1=");
                }else{
                    System.out.print(sayi);
                }
                sayi++;
            }
        }
        System.out.println(carpim);

    }
}
