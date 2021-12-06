package fr.western.human;

public class Barman extends Humain{

    private String barName;

    public Barman(String name){
        super(name, "vin");
    }

    public Barman(String name, String barName){
        super(name, "vin");
        this.barName = "Chez "+barName;
    }

    public void sePresenter(){
        super.sePresenter();
        if(this.barName != null) {
            System.out.println("mon bar s'appelle " + this.barName);
        }else{
            System.out.println("J'ai n'ai plus de bar pour l'instant");
        }
    }

    public void parle(String texte){
        super.parle(texte+ " Coco");
    }

    public void serve(Humain humain){
        this.parle("Voila ta boisson "+humain.getName());
    }




}
