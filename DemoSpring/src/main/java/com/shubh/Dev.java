package com.shubh;




public class Dev {

    private Computer com;

//    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }


//
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor");
//    }


//    Getter Setter for Age.
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    Getter Setter for Laptop
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        System.out.println("Working on Awesome Project");
//        laptop.compile();
        com.compile();

    }
}
