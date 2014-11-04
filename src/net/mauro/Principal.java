package net.mauro;

import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Principal extends GraphicsProgram {


    Exercit exercit1 = new Exercit();
    Exercit exercit2 = new Exercit();

    public void crearExercit(){


        for(int i=0;i<15;i++){
            Soldat soldat1 = new Soldat(new GImage("soldat.jpg"));
            Soldat soldat2 = new Soldat(new GImage("soldat2.png"));
            exercit1.afegirSoldat(soldat1, soldat2);


        }

    }



    public void run(){

        CampBatalla camp = new CampBatalla();

        crearExercit();

        camp.afegirExercits(this);












    }
}

