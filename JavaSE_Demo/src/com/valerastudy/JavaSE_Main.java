
package com.valerastudy;
public class JavaSE_Main {

    public static void main(String[] args) {

        //Creare obiect de tip Mug
            Mug mug = new Mug("Bere", 10);

        //Imprimare continuturi obietului
        System.out.printf("Nume: " + mug.getLabel() + ", cu volumul: " + mug.getVolume());

        //Setare alt parametru
        mug.setLabel("Mai incearca!!!");

        //Imprimam obiectul resetat
        System.out.printf("Nume: " + mug.getLabel() + ", cu volumul: " + mug.getVolume());


        //Imprimam obiectul resetat
        System.out.printf("Nume: " + new com.lexxstudy.Mug().getLable());

        new SeeMyText().main(null);

    }
}
