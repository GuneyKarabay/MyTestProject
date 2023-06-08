package com.javatraning.chapter7_ilerijava.ThreadMain;

public class OgrenciThread {
    private int no;
    private String ad;

    public OgrenciThread() {
    }

    public OgrenciThread(int no, String ad) {
        this.no = no;
        this.ad = ad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    //Threadlerle buradaki metodu çalıştıracağız.
    public void bilgiAl(String isinAdi){
        for (int i=0;i<100;i++){
            System.out.println(isinAdi +" : "+i);
        }
    }
}
