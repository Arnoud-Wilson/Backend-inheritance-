package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal {
    private boolean outdoorCat;

    public Cat(boolean outdoorCat, String name, String sex, String nameBoss, String favoFood) {
        super(name, sex, nameBoss, favoFood);
        this.outdoorCat = outdoorCat;
    }

    public boolean isOutdoorCat() {
        return outdoorCat;
    }

    public void setOutdoorCat(boolean outdoorCat) {
        this.outdoorCat = outdoorCat;
    }

    @Override
    public void makeSound() {
        System.out.println("Miauw miauw");
    }
}
