package net.mauro;

public class CampBatalla {

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 400;
    private static final int PAUSE = 10; // or whatever interval you like

    int files;

    Exercit exercit = new Exercit();
    Exercit exercit2 = new Exercit();

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void afegirExercits(Principal pissarra) {

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
        while(x<x2){


        exercit.Endavant();
        }





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
