package com.aditya;

public class Chips {
    String wrapper;
    int no_of_chips;
    String flavor;
    int size;
    static int no_of_chips_made;
    public Chips(){

    }

    public Chips(String wrapper, int no_of_chips, int size){
        this.wrapper = wrapper;
        this.no_of_chips = no_of_chips;
        this.size = size;
    }

    public static void main(String[] args) {
        Chips chip = new Chips();
        chip.wrapper = "Wood";
        chip.no_of_chips = 50;
        chip.flavor = "Cream and onion";

        Chips newChip = new Chips("Plastic", 50, 5);
    Chips.no_of_chips_made = 50;
        System.out.println(Chips.no_of_chips_made);

        int[] arr = new int[5];
        System.out.println(chip.wrapper);
        System.out.println(newChip.wrapper);
    }
}
