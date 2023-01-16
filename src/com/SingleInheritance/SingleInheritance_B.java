package com.SingleInheritance;

public class SingleInheritance_B extends SingleInheritance_A {

    public void horse() {


        System.out.println("Horses makes a  different types of sounds");
    }
    public void cat() {
        System.out.println("Cats are smart & sentient creature");
    }

    public static void main(String[] args) {
        SingleInheritance_B singleInheritance_b=new SingleInheritance_B();
        singleInheritance_b.Animal();
        singleInheritance_b.horse();
        singleInheritance_b.cat();



    }

}
