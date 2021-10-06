package com.company;

import java.awt.*;

public class Okrag {

    private Point srodek=new Point();
    private int promien;


    public Okrag(){

    }
    public Okrag(Point srodek, int promien){
        this.promien=promien;
        this.srodek=srodek;

    }
    public Okrag(int srednica, Point srodek){
        this.srodek=srodek;
        this.promien=srednica/2;

    }
    public double getPowierzchnia(){
        return Math.PI*promien*promien;

    }
    public int getSrednica(){
        return promien*2;
    }
    public int getPromien(){
        return promien;

    }
    public boolean czyWSrodku(Point p){
        double odlegloscPunktu=(p.x-srodek.x)*(p.x-srodek.x)+(p.y-srodek.y)*(p.y-srodek.y);
        if(odlegloscPunktu<promien*promien){
            return true;
        }
        else return false;

    }
    public static Okrag okragOpisany(Prostokat p){
        System.out.println("Generowanie Okręgu opisanego na Prostokącie");
          return new Okrag(p.getSrodek(),(int)p.getPrzekatna()/2);

    }
    public static Okrag okragWpisany(Prostokat p){
        // sprawdzene warunku czy Prostokat jest kwadratem(bo tylko w kwadrat można wpisać okrąg)
        if(p.getA()==p.getB()){
            System.out.println("Generowanie Okręgu wpisanego w Prostokąc");
            return new Okrag(p.getSrodek(),(int)p.getA()/2); // lub p.get.Przekatna()/2
        }
        else{
            System.out.println("W podany Prostokąt nie można wpisać okręgu");
            return  null;
        }
    }


}
