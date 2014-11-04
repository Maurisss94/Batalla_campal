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

    public void Endavant(){

        Exercit exercit = new Exercit();
        Random rn = new Random();
        int moure = rn.nextInt(exercit.soldats1.size());


        System.out.println(moure);
            exercit.soldats2.get(moure).mou(exercit);

    }


    }










