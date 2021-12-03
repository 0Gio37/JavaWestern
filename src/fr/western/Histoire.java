package fr.western;

import fr.western.human.Cowboy;
import fr.western.human.Dame;
import fr.western.human.Humain;

public class Histoire {
    public static void main(String[] args) {
        Humain humain1 = new Humain("John");
        humain1.sePresenter();

        Cowboy cowboy1 = new Cowboy("Clint");
        cowboy1.sePresenter();
        cowboy1.libererdame("Emily");
        System.out.println(cowboy1.getRating());

        Dame dame1 = new Dame("Caroline", "bleue");
        dame1.setDressColor("verte");
        dame1.EtreKidnap();
        System.out.println(dame1.getStatus());
        dame1.Etrelibere("Bill");
        System.out.println(dame1.getStatus());






    }
}
