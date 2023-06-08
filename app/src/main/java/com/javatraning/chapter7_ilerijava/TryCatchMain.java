package com.javatraning.chapter7_ilerijava;

public class TryCatchMain {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;

        int[] dizi = new int[2];    //2 elemanlı bir int dizisi oluşturduk.

        //Try ile istediğimiz işlem için kod yazdık.
        try {
            System.out.println("Sonuç : " + (x / y));
            System.out.println("İşlem tamam");
            dizi[4] = 8;

            //Eğer try içinde hata alırsak aşağıdaki catch bloğu çalışır. e.print... ile bize consoleda
            //hatanın yerini ve hatanın neyden kaynaklandığını gösterir. (y=0 ise hata "by zero" hatasıdır.)


            //***if dışında bir diğer kullanım catch sayısını artırmak.


        } catch(ArithmeticException e) {     //O a bölünme AritmeticException olduğu için direk metodu yazdık.
            System.out.println("Sayılar sıfıra bölünmez");
        }
        catch(ArrayIndexOutOfBoundsException e) {   //Dzinin boyutu IndexBound olduğu için direk yazdık.
            System.out.println("Dizinin boyutunu aştınız");
        }



       /* } catch (Exception e){
            //Hatanın türünü exception u veren kod aşağıdadır.
           // e.printStackTrace();


           /* if (e instanceof ArithmeticException){
                System.out.println("Sayılar sıfıra bölünmez");
            }
            if (e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Dizinin boyutunu aştınız.");
            }  } */







    }
}
