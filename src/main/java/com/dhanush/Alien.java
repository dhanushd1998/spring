package com.dhanush;

public class Alien {
    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien");
    }

    public Alien(int age) {
        System.out.println("Para called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setter called");
    }

    public void code() {
        System.out.println("I am coding");
        laptop.compile();
    }
}
