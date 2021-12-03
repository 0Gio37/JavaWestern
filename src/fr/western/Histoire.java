package fr.western;

import fr.western.human.Cowboy;
import fr.western.human.Humain;

public class Histoire {
    public static void main(String[] args) {
        Humain humain1 = new Humain("John");
        humain1.sePresenter();
        humain1.boire();

        Cowboy cowboy1 = new Cowboy("Clint");
        cowboy1.sePresenter();

    }
}
