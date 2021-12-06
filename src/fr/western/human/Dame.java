package fr.western.human;

public class Dame extends Humain implements Visage_Pale{

    private String dressColor;
    private boolean isCaptive;

    public Dame(String name, String dressColor){
        super(name, "lait");
        this.dressColor = dressColor;
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("J'ai une superbe robe "+this.dressColor);
    }

    public String getName(){
        return super.getName();
    }

    public Boolean getStatus(){
        return this.isCaptive;
    }

    public void setStatus(boolean val ){
        this.isCaptive = val;
    }

    public void EtreKidnap(){
    System.out.println("A L'AIDEEEEE !!!");
    this.setStatus(false);
    }

    public void Etrelibere(Cowboy cowboy){
        System.out.println("Merci mon héros ! "+cowboy.getName()+" :)");
        this.setStatus(true);
    }

    public void setDressColor(String newColor){
        System.out.println("Regardez ma nouvelle robe "+newColor);
    }

    public void quel_est_ton_nom(){
        System.out.println("Miss "+super.getName());
    }

    public void beScalp(){
        System.out.println("Aie ma tête !");
    }

}
