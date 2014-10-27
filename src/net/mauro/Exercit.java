package net.mauro;

import java.util.ArrayList;

public class Exercit {

     static ArrayList<Soldat> soldats1 = new ArrayList<>();
     static ArrayList<Soldat> soldats2 = new ArrayList<>();
    public void afegirSoldat(Soldat soldat) {

        //ArrayList<Soldat> soldats = new ArrayList<>();
        soldats1.add(soldat);
        soldats2.add(soldat);


    }
    public static void formar(){

        for(int i=0;i<soldats1.size();i++){
            soldats1.get(i).getImatge().setLocation(0,0);
        }
        for(int i=0;i<soldats2.size();i++){
            soldats2.get(i).getImatge().setLocation(300,0);
        }

    }









}
