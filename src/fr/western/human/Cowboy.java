package fr.western.human;

public class Cowboy extends Humain implements Visage_Pale{

    private String name;
    private int rating;
    private String profil;

    public Cowboy(String name){
        super(name, "whisky");
        this.name=name;
        this.rating=0;
        this.profil = "vaillant";
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("On dit de moi que je suis "+this.profil+". J'ai un indice de "+this.rating+" de popularité");
    }

    public void shootBrigand(Hors_la_loi outlaw){
        System.out.println("Le "+this.profil+" "+this.name+" tire sur "+outlaw.getName()+". PAN !");
        System.out.println("get that !!");
    }

    public void libererDame(String dameName){
        System.out.println("Liberée ma Belle "+dameName+" !");
        this.rating += 1;
    }

    public void beScalp(){
        System.out.println("Aie ma tête !");
    }


}
