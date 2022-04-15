package ifSwich;

import java.util.Scanner;

public class Sekiz {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim=scan.nextLine();

        if (isim.length()>2){

            String yeniIsim=isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2);
            System.out.println(yeniIsim);

        }else{
            System.out.println("Isim iki harften fazla olmali");
        }


    }
}
