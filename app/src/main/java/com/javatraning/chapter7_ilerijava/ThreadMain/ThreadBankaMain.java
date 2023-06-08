package com.javatraning.chapter7_ilerijava.ThreadMain;

/* Thread Synchronized :
* Bu metod ile bir işlem (bir thread bitmeden diğer threade geçmez)  bitmeden diğerine geçmeyecektir.
* Ve -200 gibi bir bakiye olmayacaktır. Program doğru çalışacaktır. */


public class ThreadBankaMain {
    public static void main(String[] args) {

        Banka b=new Banka(900);

        BankaIslemThread is1=new BankaIslemThread(b,"Ali",500);
        BankaIslemThread is2=new BankaIslemThread(b,"Zeynep",600);
        is1.start();
        is2.start();


    }

    static class BankaIslemThread extends Thread{
        //Banka sınıfından nesne ve değişkenler lazım.
        private Banka b;
        private String isim;
        private int tutar;

        //Elimizle dolu constructor oluşturacağız. Bu şekilde private olan değerleri public olarak bu classta kullanırız. Çağrı metod.
        public BankaIslemThread(Banka b,String isim,int tutar){
            //***thislerle shadowing yaparak dışarında gelen b ile içerideki b yi eşitliyoruz.
            this.b=b;
            this.isim=isim;
            this.tutar=tutar;
        }

        @Override
        public void run() {
            //--Yukarıdaki gibi tüm thread verileri yazdıktan sonra artık override ile ezilmiş metodu burada run ediceğiz.

            //Thread sleep yazdık ve gecikme payını gerçekci bir uygulama olsun diye verdik. bize try catch ile yaptı ve kodu içeri aldık.
            try {
                Thread.sleep(100);
                b.paraCek(isim,tutar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
