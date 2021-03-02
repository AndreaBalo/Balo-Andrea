package com.company;

public class Auto{
    private String szin="KEK";
    private String szin2="SARGA";
    private int sebesseg=0;
    private int sebesseg2=0;

    public Auto(){
    }

    public Auto( String szin ){
        this.szin = szin;
    }

    public void setSzin2(String szin2) {
        this.szin2 = szin2;
    }

    public int getSebesseg(){
        return sebesseg;
    }

    public int getSebesseg2() {
        return sebesseg2;
    }

    public void novelSebesseg(){
        this.sebesseg += 120;
    }

    public void novelSebesseg2() {
        this.sebesseg2 += 60;
    }

    public String toString(){
        return szin+" "+sebesseg;
    }
}