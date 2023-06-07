package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void move() {
        System.out.println("dit dier is 0.25 meter verplaatst");
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println("dit dier slaapt 8 uur");
    }


}
