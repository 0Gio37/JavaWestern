package fr.western.human;

public class Sherif extends Cowboy{

    private String name;
    private int brigandArrested;
    private String profil;

    public Sherif(String name, int brigandArrested){
        super(name);
        this.name = name;
        this.brigandArrested = brigandArrested;
        this.profil = "honnête";
    }

    public void coffrerBrigand(){
        System.out.println("Au nom de la loi je vous arrete !!!");
    }

    public void rechercherBrigand(){
        System.out.println("OYEZ OYEZ BRAVE GENS !! 200 $ a` qui arretera Bob le brigand mort ou vif !!");
    }

    public void sePresenter(){
        System.out.println("je suis le Sherif "+this.name+" et j'ai coffré "+this.brigandArrested+" brigand(s)");
    }




}
