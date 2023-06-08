package com.javatraning.chapter7_ilerijava.ThreadMain;

public class ThreadMain {

    public static void main(String[] args) {

        BirinciThread bt1 = new BirinciThread();
        bt1.start();   //Multithread için start kullanmak lazım. Run değil.


        Thread bt2 = new Thread(new IkinciThread());
        bt2.start();

        for(int i =0; i<100; i++){
            System.out.println("Main : "+i);
        }
    }

    //Birinci Thread ksımı
    static class BirinciThread extends Thread{

//run yaz override metodunu çalıştır.

        @Override
        public void run() {
            for(int i =0; i<100; i++){
                System.out.println("Birinci Thread : "+i);
            }
        }

    }
}
