package fr.western.human;

public class Brigand extends Humain{

    private String name;
    private String look;
    private int dameKidnapped;
    private int forFreeze;
    private boolean inJail;

    public Brigand(String name, String look, int dameKidnapped, int forFreeze, boolean inJail){
        super(name);
        this.look = "méchant";
        this.dameKidnapped = dameKidnapped;
        this.forFreeze = 100;
        this.inJail = inJail;
    }

    public void kidnappe(String nomDame){
        System.out.println("Ah ah ! "+nomDame+" tu es mienne désormais !");
    }

    public void enprisonne(String nomCowboy){
        System.out.println("Damned, je suis fait ! fucking "+nomCowboy+" u got me ....");
    }

    public int recompensePourCapture(){
        return this.forFreeze;
    }



}
