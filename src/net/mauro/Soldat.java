package net.mauro;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;

public class Soldat {

    GImage imatge;
    double x;
    double y;
    String direccio;

    public Soldat(GImage imatge) {
        this.imatge = imatge;

    }
    public GImage getImatge() {
        return imatge;
    }

    public double getX() {
        return x;
    }
    public double setX(double d) {
        this.x = d;
        return x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }



    public void mou(Exercit exercit){

        Random rn = new Random();
        int moure = rn.nextInt(exercit.soldats1.size());
        
        	exercit.soldats1.get(moure).getImatge().move(15, 0);
            exercit.soldats1.get(moure).getImatge().pause(500);
        
            




    }


}
