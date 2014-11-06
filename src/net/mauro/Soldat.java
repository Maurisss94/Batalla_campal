package net.mauro;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Soldat {

    GImage imatge;
    double x;
    double y;
    String direccio;
    double desti;
    boolean arribat;

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
    public double getDesti() {
        return desti;
    }
    public void setDesti(double desti) {
        this.desti = desti;
    }

    public boolean isArribat() {
        return arribat;
    }
    public void setArribat(boolean arribat) {
        this.arribat = arribat;
    }

    public boolean Morts(Soldat soldat){

        if(this.Rectangle().intersects(soldat.Rectangle())){
            return true;
        }else{
            return false;
        }


    }
    public GRectangle Rectangle(){
        return getImatge().getBounds();

    }
    public void mouExercit1(){

             if(desti< 1000-this.imatge.getWidth()){
                 this.arribat = false;
                 this.getImatge().move(10, 0);
                 this.getImatge().pause(5);

             }else{
                 this.arribat = true;
                 this.getImatge().move(0, 0);
             }

             desti=this.getImatge().getX();

             this.setX(desti);



    }
    public void mouExercit2(){


        if(desti >= 0){
            this.arribat = false;

            this.getImatge().move(-10, 0);
            this.getImatge().pause(5);

        }else{
            this.arribat = true;

        }

        desti=this.getImatge().getX();
        this.setX(desti);




}


}
