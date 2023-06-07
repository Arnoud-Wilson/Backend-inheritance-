package nl.novi.javaprogrammeren.overerving;

public abstract class DomesticAnimal extends Animal {
    private String nameBoss;
    private String favoFood;


    public DomesticAnimal(String name, String sex, String nameBoss, String favoFood) {
        super(name, sex);
        this.nameBoss = nameBoss;
        this.favoFood = favoFood;
    }

    public String getNameBoss() {
        return nameBoss;
    }

    public void setNameBoss(String nameBoss) {
        this.nameBoss = nameBoss;
    }

    public String getFavoFood() {
        return favoFood;
    }

    public void setFavoFood(String favoFood) {
        this.favoFood = favoFood;
    }

    public abstract void makeSound();
}
