package net.mauro;

import java.util.ArrayList;
import java.util.Random;

public class Exercit {

     static ArrayList<Soldat> soldats1 = new ArrayList<>();
     static ArrayList<Soldat> soldats2 = new ArrayList<>();



    public void afegirSoldat(Soldat soldatExercit1, Soldat soldatExercit2) {


        soldats1.add(soldatExercit1);
        soldats2.add(soldatExercit2);


    }

    public static void Endavant(){

        Random rn = new Random();


        for(int i=0;i<soldats1.size();i++){

            int moure = rn.nextInt(soldats1.size());
            soldats1.get(moure).mouExercit1();

        }

        for(int i=0;i<soldats2.size();i++){

            int moure = rn.nextInt(soldats2.size());
            soldats2.get(moure).mouExercit2();

        }
        }




    }













