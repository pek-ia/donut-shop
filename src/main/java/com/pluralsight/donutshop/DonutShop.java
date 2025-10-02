package com.pluralsight.donutshop;

public class DonutShop {

    public static void main(String[] args) {

        // A default donut.  I can't guarantee it will suit your needs...
        Donut donut = new Donut();

        // These are strings, not donuts.  Useless!
        String[] donuts = {
                "Fantasia de chocolade",
                "Strawberry Dream"
        };

        // The array can hold 10 donuts (or less)
        // The uninitialized ones are null, and will poison you if you try them

        Donut[] mydonuts = new Donut[10];

        // Instantiate the first donut
        mydonuts[0] = new Donut("Vanilla", "Strawberry", true, true, 752, 1.00);

        Donut d = mydonuts[0];


        System.out.println( "Calories: " + d.getCalories() );

        // discount donut price using public setter
        mydonuts[0].setPrice( .9 * d.getPrice());
        System.out.printf( "Price: $%.2f\n", d.getPrice() );

        System.out.println("Default donut using generated toString method: \n\t" + d);

    }

}
