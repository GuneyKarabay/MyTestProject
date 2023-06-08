package com.javatraning.chapter7_ilerijava.ThreadMain;

public class Banka {

    //Deneme amaçlı 2. commit için satır güncellendi.
    private int bakiye;

    public Banka() {
    }

    public Banka(int bakiye) {
        this.bakiye = bakiye;
    }
    //kim ne kadar para çektiyi öğrenmek için
    public synchronized void paraCek(String isim,int tutar){
        //çekilmek istenen tutar ve kalan bakiyeyi yazdırmak hesaplamak için.
    if (tutar>bakiye){
        System.out.println(isim+" : Hesapta para kalmadı.");
    }else {
        bakiye=bakiye-tutar;
        System.out.println(isim+" : Hesapta kalan para "+bakiye);
    }
    }
}
