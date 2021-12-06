package fr.western.human;

public class Dame extends Humain implements Visage_Pale{

    private String dressColor;
    private String status;
    private String name;

    public Dame(String name, String dressColor){
        super(name, "lait");
        this.name = name;
        this.dressColor = dressColor;
        this.status = "libre";
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("J'ai une superbe robe "+this.dressColor);
    }

    public String getName(){
        return this.name;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String newState){
        this.status = newState;
    }

    public void EtreKidnap(){
    System.out.println("A L'AIDEEEEE !!!");
    this.setStatus("captive");
    }

    public void Etrelibere(Hors_la_loi outlaw){
        System.out.println("Merci mon héros ! "+outlaw.getName()+" :)");
        this.setStatus("libre");
    }

    public void setDressColor(String newColor){
        System.out.println("Regardez ma nouvelle robe "+newColor);
    }

    public void quel_est_ton_nom(){
        System.out.println("Miss "+this.name);
    }

    public void beScalp(){
        System.out.println("Aie ma tête !");
    }

}
