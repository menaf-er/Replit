package forWhile;

public class For_while_3 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str= "Javaisalsoeasy";

        String harfler[]= str.split("");

        int sayac=0;
        String tekrar="";
        for (int i = 0; i < harfler.length; i++) {
            for (int j = 0; j < harfler.length; j++) {
                if (harfler[i].equals(harfler[j])){
                    sayac++;
                }
            }
            if (sayac!=1){
                if (!tekrar.contains(harfler[i])){
                    tekrar=tekrar+harfler[i]+" ";
                }
            }
            sayac=0;
        }
        System.out.println(tekrar);

    }
}
