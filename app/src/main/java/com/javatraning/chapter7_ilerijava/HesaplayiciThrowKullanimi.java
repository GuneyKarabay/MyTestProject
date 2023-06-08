package com.javatraning.chapter7_ilerijava;

public class HesaplayiciThrowKullanimi {

    //Throws ile exception oluşturuyoruz. kendimiz.

    public int bol(int sayi1,int sayi2) throws Exception {  //throws exeption ile hata fırlatan bir exception dedik.
        if (sayi2 == 0) throw new Exception("Sıfıra bölünmez");  //0 a eşit se hata fırlatacaktır.
        return sayi1/sayi2;                                     //hata yoksa işlemi yapar.
    }
}
