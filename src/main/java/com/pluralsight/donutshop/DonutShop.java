package com.pluralsight.donutshop;

public class DonutShop {

    public static void main(String[] args) {

        // A default donut.  I can't guarantee it will suit your needs...
        Donut donut = new Donut();

        // These are strings, not donuts!  Useless!
        String[] donuts = {
                "Fantasia de chocolade",
                "Strawberry Dream"
        };

        // The array can hold 10 donuts (or less)
        // The uninitialized ones are null, and will poison you if you try them

        Donut[] mydonuts = new Donut[10];

        // Time to make the the donuts!
        mydonuts[0] = new Donut("Vanilla", "Chocolate", true, true, 752, 1.00);
        mydonuts[1] = new Donut("Vanilla", "Strawberry", true, true, 752, 1.00);
        mydonuts[2] = new Donut("Strawberry", "Chocolate", false, true, 752, 1.00);
        mydonuts[3] = new Donut("Lemon", "Lemon", true, true, 752, 1.00);
        mydonuts[4] = new Donut("Vanilla", "Raspberry", true, true, 752, 1.00);
        mydonuts[5] = new Donut("Cherry", "Chocolate", false, true, 752, 1.00);
        mydonuts[6] = new Donut("Vanilla", "Medjool Date", true, true, 752, 1.00);
        mydonuts[7] = new Donut("Chocolate", "Chocolate", true, true, 752, 1.00);
        mydonuts[8] = new Donut("Chocolate", "Vanilla", false, true, 752, 1.00);
        mydonuts[9] = new Donut("Chocolate", "Cherry", true, true, 752, 1.00);


        System.out.println("Here are our donuts!");

        // Iterating through an array, or Traversing the array
        // while loop

        System.out.println("Iterate with a while loop");
        // Initialize
        int counter = 0;

        // Test
        while(counter < 10){
            System.out.println(mydonuts[counter]);

            // Modify
            counter = counter + 1;
        }


        counter = 0;
        // Find the first chocolate donut
        System.out.println("The first chocolate donut is: ");
        while(counter < 10){
            if (  mydonuts[counter].getDoughFlavor().equals("Chocolate") ) {
                System.out.println(mydonuts[counter]);
                break;
            }
            // Modify
            counter = counter + 1;
        }

        counter = 0;
        // Find the first chocolate donut
        System.out.println("Non-chocolate donuts: ");
        while(counter < 10){
            // The "trick" with using the continue statement is making
            // sure to increment the counter to get to the next iteration
            // -- whether or not you want to use the current object

            // Get the current object AND increment the counter
            Donut theCurrentDonut = mydonuts[counter++];
            if (  theCurrentDonut.getDoughFlavor().equals("Chocolate") ) {
                continue;
            }
            System.out.println(theCurrentDonut);

        }

        // Iterate with for loop

        System.out.println("Iterate with a for loop");

        // Initialize, test, modify
        for(counter = 1; counter < 10; counter+=2 )
            System.out.println(mydonuts[counter]);

        // Iterate with for-each loop (enhanced for loop)
        System.out.println("Iterate with for-each loop");

        // Go through all the donuts
        for(Donut d: mydonuts) System.out.println(d);

        Donut d = mydonuts[0];

        // Print out using toString method
        System.out.println(d);


        System.out.println( "Calories: " + d.getCalories() );

        // discount donut price using public setter
        mydonuts[0].setPrice( .9 * d.getPrice());
        System.out.printf( "Price: $%.2f\n", d.getPrice() );


    }

}
