package fr.western.human;

public class Humain {

    private String nom;
    private String boisson;

     public Humain(String nom){
        this.nom= nom;
        this.boisson = "eau";
    }

    public void parle(String texte){
        System.out.println("("+this.nom+")" + " - " + texte);
    }

    public void sePresenter(){
        System.out.println("Bonjour, je m'appelle "+this.nom+" et ma boisson favorite est : "+this.boisson);
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.boisson+ "! GLOUPS !");
    }

    public String quel_est_ton_nom(){
       return this.nom;
    }

    public String boisson_favorite(){
        return this.boisson;
    }

}
