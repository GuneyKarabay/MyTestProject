package com.javatraning.chapter7_ilerijava.ThreadMain;
/*  2 Thread, 1 Metod :

1- Diğer sınıftan aldığı nesneleri tek bir sınıf altında 2 Thread oluşturarak start ile çalıştırdık.

2-Bu dinamik ve profesyonel bir yapıdır.

3-Memory de tasarruf ve etkin çalışma sağlar. Öncelik isteyen parça ve odaları önce çalıştırır ve yazılımın görevini aksatmaz. */


public class ThreadNesneMain88 {
    public static void main(String[] args) {
        //Aşağıdaki oluşturduğumuz threadi burada yeni bir o nesnesini oluşturup no isim yazarak atadık ve start ile çalıştırdık.

        //*** METODLARIN THREAD LERLE ÇALIŞTIRILMASI.

        OgrenciThread o = new OgrenciThread(23,"Kemal");
        BenimThread is1 = new BenimThread("İlk iş",o);
        is1.start();

        BenimThread is2 = new BenimThread("2. iş",o);
        is2.start();


    }
    //Thread almak için oluşturduk.
    static class BenimThread extends Thread{
        private String isinAdi;
        private OgrenciThread o;

        //Kendimiz constructor oluşturduk. Thread almak için. ***OgrenciThread deki private olan isinadi ve o nesnesini aldık buraya.
        public BenimThread(String isinAdi,OgrenciThread o){
            this.isinAdi=isinAdi;
            this.o=o;
        }

        //Thread mantığıyla OgrenciThread sınıfıntan aldığımız "o" nesnesini "run" ettik.
        @Override
        public void run() {
            o.bilgiAl(isinAdi);
        }
    }

}
