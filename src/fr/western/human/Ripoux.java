package fr.western.human;

public class Ripoux extends Humain implements Hors_la_loi{

    private int forFreeze;

    public Ripoux(String name, int forFreeze){
        super(name);
        this.forFreeze = forFreeze;
    }

    public String getName(){
        return super.getName();
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
        System.out.println("Je suis "+super.getName());
    }

}
