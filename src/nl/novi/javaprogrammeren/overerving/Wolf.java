package nl.novi.javaprogrammeren.overerving;

public class Wolf extends ExoticAnimal {
    private String namePack;

    public Wolf(String namePack, String name, String sex, String cageName, String countryOfOrigin, String lastDayFed) {
        super(name, sex, cageName, countryOfOrigin, lastDayFed);
        this.namePack = namePack;
    }

    public String getNamePack() {
        return namePack;
    }

    public void setNamePack(String namePack) {
        this.namePack = namePack;
    }

    @Override
    public void makeSound() {
        System.out.println("Ahoo ahoo");
    }
}
