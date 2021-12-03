package fr.western.human;

public class Brigand extends Humain implements Hors_la_loi{

    private String name;
    private String look;
    private int dameKidnapped;
    private int forFreeze;
    private boolean inJail;

    public Brigand (String name, int dameKidnapped, boolean inJail){
        super(name, "tord-boyau");
        this.name = name;
        this.look = "méchant";
        this.forFreeze = 100;
        this.dameKidnapped = dameKidnapped;
        this.inJail = inJail;
    }

    public String getName(){
        return this.name;

    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("J'ai l'air "+this.look+" et j'ai kidnappé "+this.dameKidnapped+" dames");
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
        System.out.println("Je suis "+this.name+" le "+this.look);
    }



}
