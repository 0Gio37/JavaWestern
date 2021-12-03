package fr.western.human;

public class Cowboy extends Humain{

    private String name;
    private int rating;
    private String profil;

    public Cowboy(String name){
        super(name, "whisky");
        this.name=name;
        this.rating=0;
        this.profil = "vaillant";
    }

    public int getRating(){
        return this.rating;
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("On dit de moi que je suis "+this.profil+". J'ai un indice de "+this.rating+" de popularité");
    }

    public void ShootBrigand(String brigandName){
        System.out.println("Le "+this.profil+" "+this.name+" tire sur "+brigandName+". PAN !");
        System.out.println("get that !!");
    }

    public void libererdame(String dameName){
        System.out.println("Liberée ma Belle "+dameName+" !");
        this.rating += 1;
    }


}
