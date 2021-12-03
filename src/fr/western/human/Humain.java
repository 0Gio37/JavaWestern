package fr.western.human;

public class Humain {

    private String name;
    private String boisson;

     public Humain(String name){
        this.name= name;
        this.boisson = "l'eau";
    }

    public void parle(String texte){
        System.out.println("("+this.name+")" + " - " + texte);
    }

    public void sePresenter(){
        System.out.println("Bonjour, je m'appelle "+this.name+" et ma boisson favorite est "+this.boisson);
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.boisson+ "! GLOUPS !");
    }

    public String quel_est_ton_nom(){
       return this.name;
    }

    public String boisson_favorite(){
        return this.boisson;
    }

}
