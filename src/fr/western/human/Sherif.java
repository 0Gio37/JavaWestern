package fr.western.human;

public class Sherif extends Cowboy{

    private int brigandArrested;
    private String profil;

    public Sherif(String name, int brigandArrested){
        super(name);
        this.brigandArrested = brigandArrested;
        this.profil = "honnête";
    }

    public void coffrerBrigand(Hors_la_loi outLaw){
        System.out.println("Au nom de la loi je vous arrete !!!");
        outLaw.emprisonneBy(this);
        this.brigandArrested++;
    }

    public void rechercherBrigand(Brigand brigand){
        System.out.println("OYEZ OYEZ BRAVE GENS !! 200 $ a` qui arretera "+ brigand.getName() +" mort ou vif !!");
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("J'ai coffré "+this.brigandArrested+" brigand(s)");
    }




}
