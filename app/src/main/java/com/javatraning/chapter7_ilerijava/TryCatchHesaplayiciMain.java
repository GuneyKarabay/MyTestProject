package com.javatraning.chapter7_ilerijava;

public class TryCatchHesaplayiciMain {
    public static void main(String[] args) {

        HesaplayiciThrowKullanimi h = new HesaplayiciThrowKullanimi();
        //h.bol de kırmızı hata verdi. diyor ki sen Hesaplayici sınıfında throw veren hata belirtmişsin Try Catch kullan.
       //kırmızı otomatik 2. seçenek "surrond" olan seçeneği seçeceğiz.
        try {
           // h.bol(3,1);
            System.out.println("Sonuç : "+h.bol(3,1) );
        } catch (Exception e) {
          //  throw new RuntimeException(e);     //Hesaplayici daki sıfıra bölünmez hatasını 0 yazarsak aldık.
        //İstersek system.out ile hata bloğu yerine konsola mesaj yazarız.
            System.out.println("Sayılar 0 a bölünmez gardaşım.");

        }
        //Tek tek diğer sınıflardaki hatalarıda konsolda yazdı.
    }
}
