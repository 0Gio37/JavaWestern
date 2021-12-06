package fr.western.human;

public class Indien extends Humain{

    private String name;
    private int nbPlumes;
    private String totem;
    private String boisson;

    public Indien(String name,int nbPlumes){
        super(name, "jus de racine");
        this.name = name;
        this.nbPlumes = nbPlumes;
        this.totem = "Coyotte";
    }

    public void parle(String texte){
        super.parle(texte+" Ugh !");
    }

    public void sePresenter(String fin){
        System.out.println("Bonjour, je m'appelle "+this.name+" et ma boisson favorite est "+this.boisson+" Ugh !");
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.boisson+ "! Ugh !");
    }

    public void quel_est_ton_nom(){
        System.out.println("Je suis "+this.name+" ugh");
    }

    public void scalpSo(){
        this.nbPlumes +=1;
    }



}
