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
            add(soldat1.getImatge());
            add(soldat2.getImatge());
            exercit1.afegirSoldat(soldat1);
            exercit2.afegirSoldat(soldat2);
        }

    }



    public void run(){

    	this.setSize(800, 400);
        crearExercit();
        exercit1.formar();

    }
}

