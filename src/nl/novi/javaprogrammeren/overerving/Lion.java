package nl.novi.javaprogrammeren.overerving;

public class Lion extends ExoticAnimal {
    int numberOfKids;

    public Lion(int numberOfKids, String name, String sex, String cageName, String countryOfOrigin, String lastDayFed) {
        super(name, sex, cageName, countryOfOrigin, lastDayFed);
        this.numberOfKids = numberOfKids;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }


    @Override
    public void makeSound() {
        System.out.println("Grauwl grauwl");
    }
}
