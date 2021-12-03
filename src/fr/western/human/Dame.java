package fr.western.human;

public class Dame extends Humain{

    private String dressColor;
    private String status;
    private String name;

    public Dame(String name, String dressColor, String status){
        super(name);
        this.dressColor = dressColor;
        this.status = status;
    }

    public void EtreKidnap(){
    System.out.println("A L'AIDEEEEE !!!");
    }

    public void liberer(){
        System.out.println("Merci mon héros ! :)");
    }

    public void setDressColor(String newColor){
        System.out.println("Regardez ma nouvelle robe "+newColor);
    }




}
