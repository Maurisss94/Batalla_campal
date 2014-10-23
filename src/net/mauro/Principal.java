package net.mauro;

import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Principal extends GraphicsProgram {


    public void crearExercit(){
        Exercit exercit1 = new Exercit();

        for(int i=0;i<15;i++){
            exercit1.afegirSoldat(new Soldat(new GImage("/home/mauro/Escritorio/CFGS 2 DAW/Programació/soldat.jpg"), 0, 0));
        }
    }


    public void run(){


    }
}

