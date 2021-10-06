package com.company;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point s1=new Point(1,-4);
        Okrag okrag1 = new Okrag(s1,5);
        Point p1 =new Point(1,0);
        System.out.println(okrag1.czyWSrodku(p1));

        Point srodekProst =new Point(6,10);
        Prostokat prostokat1 = new Prostokat(srodekProst,6,4);
        Okrag.okragOpisany(prostokat1);
        Okrag.okragWpisany(prostokat1);









    }
}
