package ifSwich;

import java.util.Scanner;

public class Iki {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
Input :
John White
1234234534561478
Output : Name :
J*** W****
CCN : **** **** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad=scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyad=scan.next();
        System.out.println("Kradi karti numaranizi giriniz");
        String kartNo=scan.next();

        String yeniIsim=ad.substring(0,1).toUpperCase()+ ad.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\S","*");
        String yeniKrtNo=("**** **** **** ")+kartNo.substring(kartNo.length()-4);

        System.out.println("Name : \n"+yeniIsim+yeniSoyisim);
        System.out.println("CCN : "+yeniKrtNo);

    }
}
