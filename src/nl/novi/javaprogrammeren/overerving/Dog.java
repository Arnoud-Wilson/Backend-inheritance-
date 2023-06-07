package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticAnimal {

    public Dog(String name, String sex, String nameBoss, String favoFood) {
        super(name, sex, nameBoss, favoFood);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
