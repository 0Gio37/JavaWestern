package fr.western.human;

public class Ripoux implements Hors_la_loi{

    private String name;
    private int forFreeze;

    public Ripoux(String name, int forFreeze){
        this.name = name;
        this.forFreeze = forFreeze;
    }

    public String getName(){
        return this.name;
    }
    public void kidnappe(Dame dame){
        System.out.println("Ah ah ! "+dame.getName()+" tu es mienne désormais !");
    }

    public void emprisonneBy(Cowboy cowboy){
        System.out.println("Damned, je suis fait ! fucking "+cowboy.getName()+" u got me ....");
    }

    public int recompensePourCapture(){
        return this.forFreeze;
    }

    public void quel_est_ton_nom(){
        System.out.println("Je suis "+this.name);
    }

}
