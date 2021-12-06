package fr.western.human;

public class Femme_Brigand extends Dame implements Hors_la_loi{

    private String name;
    private int forFreeze;
    private String dressColor;

    public Femme_Brigand (String name, String dressColor){
        super(name,dressColor);
        this.name =name;
        this.dressColor = dressColor;
        this.forFreeze = 50;
    }

    public void emprisonneBy(Cowboy cowboy){
        System.out.println("Damned, je suis fait ! fucking "+cowboy.getName()+" u got me ....");
    }

    public void kidnappe(Dame dame){
        System.out.println("Ah ah ! "+dame.getName()+" tu es mienne désormais !");
    }

    public int recompensePourCapture(){
        return this.forFreeze;
    }

    public void quel_est_ton_nom(){
        System.out.println("Je suis "+this.name);
    }

    public String getName(){
        return this.name;
    }

}
