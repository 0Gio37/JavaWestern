package fr.western;

import fr.western.human.*;

public class Histoire {
    public static void main(String[] args) {
        Humain humain1 = new Humain("John");
        Cowboy cowboy1 = new Cowboy("Clint");
        Dame dame1 = new Dame("Caroline", "bleue");
        Brigand brigand1 = new Brigand("Dalton",3,false);
        Barman barman1 = new Barman("Polly");
        Barman barman2 = new Barman("Michel","Mimich");

        barman1.sePresenter();
        barman2.sePresenter();
        barman1.parle("Ca fait 10€ le verre");

        /*
        dame1.boire();
        humain1.boire();
        humain1.sePresenter();
        humain1.quel_est_ton_nom();
        cowboy1.sePresenter();
        cowboy1.libererdame("Emily");
        System.out.println(cowboy1.getRating());
        dame1.setDressColor("verte");
        dame1.EtreKidnap();
        System.out.println(dame1.getStatus());
        dame1.Etrelibere("Bill");
        System.out.println(dame1.getStatus());
        dame1.quel_est_ton_nom();
        brigand1.sePresenter();
        brigand1.quel_est_ton_nom();
*/







    }
}
