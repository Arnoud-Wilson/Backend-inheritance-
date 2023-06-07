package nl.novi.javaprogrammeren.overerving;

public abstract class ExoticAnimal extends Animal {
    private String cageName;
    private String countryOfOrigin;
    private String lastDayFed;


    public ExoticAnimal(String name, String sex, String cageName, String countryOfOrigin, String lastDayFed) {
        super(name, sex);
        this.cageName = cageName;
        this.countryOfOrigin = countryOfOrigin;
        this.lastDayFed = lastDayFed;
    }

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getLastDayFed() {
        return lastDayFed;
    }

    public void setLastDayFed(String lastDayFed) {
        this.lastDayFed = lastDayFed;
    }

    @Override
    public abstract void makeSound();
}
