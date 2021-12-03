package fr.western.human;

public class Humain {

    private String name;
    private String boisson;

     protected Humain(String name, String boisson){
        this.name= name;
        this.boisson = boisson;
    }

    public Humain(String name){
        this.name= name;
        this.boisson = "l'eau";
    }

    public String getName(){
         return this.name;
    }

    public void parle(String texte){
        System.out.print("("+this.name+")" + " - " + texte);
    }

    public void sePresenter(){
        System.out.println("Bonjour, je m'appelle "+this.name+" et ma boisson favorite est "+this.boisson);
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.boisson+ "! GLOUPS !");
    }

    public void quel_est_ton_nom(){
        System.out.println("Je suis "+this.name);
    }

    public String boisson_favorite(){
        return this.boisson;
    }

}
