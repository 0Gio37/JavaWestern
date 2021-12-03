package fr.western.human;

public class Dame extends Humain{

    private String dressColor;
    private String status;
    private String name;

    public Dame(String name, String dressColor){
        super(name);
        this.dressColor = dressColor;
        this.status = "libre";
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


    public void Etrelibere(String cowboyName){
        System.out.println("Merci mon héros ! "+cowboyName+" :)");
        this.setStatus("libre");
    }

    public void setDressColor(String newColor){
        System.out.println("Regardez ma nouvelle robe "+newColor);
    }




}
