package fr.western.human;

public class Brigand extends Humain implements Hors_la_loi, Visage_Pale{

    private String look;
    private int dameKidnapped;
    private int forFreeze;
    private boolean inJail;

    public Brigand (String name, int dameKidnapped, boolean inJail){
        super(name, "tord-boyaux");
        this.look = "méchant";
        this.forFreeze = 100;
        this.dameKidnapped = dameKidnapped;
        this.inJail = inJail;
    }

    public String getName(){
        return super.getName();
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("J'ai l'air "+this.look+" et j'ai kidnappé "+this.dameKidnapped+" dames");
        this.parle("ma tête est mise à prix à "+this.forFreeze+" $");
    }

    public void kidnappe(Dame dame){
        System.out.println("Ah ah ! "+dame.getName()+" tu es mienne désormais !");
        this.dameKidnapped ++;
        this.forFreeze += 100;
    }

    public void emprisonneBy(Cowboy cowboy){
        System.out.println("Damned, je suis fait ! fucking "+cowboy.getName()+" u got me ....");
    }

    public int recompensePourCapture(){
        return this.forFreeze;
    }

    public void quel_est_ton_nom(){
        System.out.println("Je suis "+super.getName()+" le "+this.look);
    }

    public void beScalp(){
        System.out.println("Aie ma tête !");
    }

}
