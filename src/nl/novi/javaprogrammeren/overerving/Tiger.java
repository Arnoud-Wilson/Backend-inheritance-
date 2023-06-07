package nl.novi.javaprogrammeren.overerving;

public class Tiger extends ExoticAnimal {
    int numberOfStripes;

    public Tiger(String name, String sex, String cageName, String countryOfOrigin, String lastDayFed, int numberOfStripes) {
        super(name, sex, cageName, countryOfOrigin, lastDayFed);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void makeSound() {
        System.out.println("Wrauw wrauw");
    }
}
