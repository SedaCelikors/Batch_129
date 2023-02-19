package day27encapsulsationabstraction;

public class Student {

    private String stdId="AC123";
    private double gpa= 3.99;
    private boolean poor= true;

                    //Encapsulation yapilmis data yi okuyabilir miyiz?
    //get method lar (getter) enkapsule edilmis(saklanmis) datayi okumamiza yarar
    //get method lar (getter) herzaman "public" olur.
    //get method larin return type'i variable'in data type'i ile ayni olur
    //get method'larin isimleri get+variable name seklinde olur.
    //get method'larin isimleri variable boolean ise is + variable name seklinde olur.
    // get method'lar parametre kullanmazlar
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

                            //Encapsulation yapilmis datalarin degeri degistirebilir miyiz?
    //set method'lar(setter) encapsulation edilmis datalarin degerlerini degistirmemize yarar.
    //set method'lar herzaman "public" olur
    //set method'larin return type'i her zaman "void" olur.
    //set method'larin isimleri get+variable name seklinde olur.
    //set method'lar variable ile ayni data type inda parametre kullanirlar.

    //getter ve setter' larin ikisine birden "Java Beans" denir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
