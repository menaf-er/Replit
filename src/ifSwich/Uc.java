package ifSwich;

import java.util.Scanner;

public class Uc {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz pozitif tam sayilari yaziniz");
        long sayi1= scan.nextLong();
        long sayi2= scan.nextLong();
        long limit=1000000000;

        if (sayi1>=limit || sayi2>=limit || sayi1+sayi2>=limit){
            System.out.println("OverFlow");
        }else if(sayi1<0 || sayi2<0){
            System.out.println("Lutfen tekrar deneyiniz");
        }else {
            System.out.println(sayi1+sayi2);
        }


    }
}
