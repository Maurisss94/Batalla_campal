package net.mauro;

import java.util.Random;

public class CampBatalla {

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 400;
    private static final int PAUSE = 10; // or whatever interval you like

    int files;

    static Exercit exercit = new Exercit();
    static Exercit exercit2 = new Exercit();

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }


    public void afegirExercit1(Principal pissarra) {


        int files = definirFiles(pissarra);
        int cont = 0;
        double y = exercit.soldats1.get(0).getImatge().getY();
        double x = exercit.soldats1.get(0).setX(0);
        double heightImage = exercit.soldats1.get(0).getImatge().getHeight();
        double widthImage = exercit.soldats1.get(0).getImatge().getWidth();

        for (int i = 0; i < exercit.soldats1.size(); i++) {

            exercit.soldats1.get(i).getImatge().setLocation(x, y);
            pissarra.add(exercit.soldats1.get(i).getImatge());
            y = y + heightImage;
            cont++;
            if (cont == files) {
                cont = 0;
                x = x + widthImage;
                y = 0;
            }

        }


    }

    public void afegirExercit2(Principal pissarra){


    int files = definirFiles(pissarra);

    double heightImage2 = exercit2.soldats2.get(0).getImatge().getHeight();
    double widthImage2 = exercit2.soldats2.get(0).getImatge().getWidth();
    double y2= exercit2.soldats2.get(0).getImatge().getY();
    double x2 = exercit2.soldats2.get(0).setX(WIDTH-widthImage2);
    int cont2=0;

    for (int i = 0; i < exercit2.soldats2.size(); i++) {

        exercit2.soldats2.get(i).getImatge().setLocation(x2, y2);
        pissarra.add(exercit2.soldats2.get(i).getImatge());
        y2 = y2 + heightImage2;
        cont2++;
        if (cont2 == files) {
            cont2 = 0;
            x2 = x2 - widthImage2;
            y2 = 0;
        }

    }



    while(!exercit1Arriben()||!exercit2Arriben()){
        MouExercit();

    }


    }
    public void MouExercit(){
        Exercit.Endavant();

    }

    public boolean exercit1Arriben(){
        int cont=0;
        for(int i=0;i<exercit.soldats1.size();i++){
            if(exercit.soldats1.get(i).isArribat()){
                cont++;
            }
        }

        if(cont ==exercit.soldats1.size()){

            return true;
        }
        return false;
    }
    public boolean exercit2Arriben(){
        int cont=0;
        for(int i=0;i<exercit2.soldats2.size();i++){
            if(exercit2.soldats2.get(i).isArribat()){
                cont++;
            }
        }

        if(cont ==exercit2.soldats2.size()){

            return true;
        }
        return false;
    }




    public int definirFiles(Principal pissarra) {

        pissarra.resize(WIDTH, HEIGHT);
        pissarra.pause(PAUSE);

        int alturaCanvas = pissarra.getHeight();
        double alturaImatge = exercit.soldats1.get(0).getImatge().getHeight();
        double files = alturaCanvas / alturaImatge;
        int filesInt = (int) files;
        return filesInt;
    }

}
