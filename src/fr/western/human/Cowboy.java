package fr.western.human;

public class Cowboy extends Humain{

    private String name;
    private int rating;
    private String profil;


    public Cowboy(String name, int rating, String profil){
        super(name);
        this.rating=0;
        this.profil = "vaillant";
    }

    public void ShootBrigand(String brigandName){
        System.out.println("Le "+this.profil+" "+this.name+" tire sur "+brigandName+". PAN !");
        System.out.println("get that !!");
    }

    public void libererdame(String dameName){
        System.out.println("Liberée ma Belle "+dameName+" !");
    }


}
