package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Accepting user input is one of the most important things we need to learn how to do.
        //Scanner is the utility that Java gives us to do this.

        Scanner input = new Scanner(System.in);
        
        /*
        The line above breaks down into:
        Scanner is the utility we would like to use.
        When we want to use it we just want to call input;
        To initialize this Scanner I want Java to know I need a NEW scanner.
        This new Scanner is going to use the System.in property which is telling Java that there is going to be input (.in)
        from the system we will need to process.
         */

        //So we have initialized this scanner to know it accepting input, how do we get that input?
        //This will depend on what type of input we are expecting from the user, will it be a string, an int, a boolean?

        //UnComment this line after running the first time to try to get user input
//        System.out.print("Enter a string: ");
//        String userString = input.nextLine();

        /*
        The line above is using our scanner to accept a string.

        Java is a strict language so we have to explicitly tell it what its going to expect.

        Lets take a look at what the program is holding a reference to when we use this.

        Don't worry too much about the line I'm about to use, we'll talk about it more in depth soon
         */

//        System.out.println(userString);

        /*
        So we see when we run the program we only have a blank line, it looks like there is nothing happening but
        in actuality it's still waiting on our input we just didn't make it very user friendly so we know were waiting
        on some sort of input.

        So while Java is a strict language it still only does what you tell it to.  So lets go back and add in the prompt
        to let us know its waiting for some input.

        So now that we have see what happens when we use scanner for a string what happens if we run the program again
        and put in an number instead of a string?

        So we put in a number instead of a string and it looks like it worked just fine, the same number was shown in the
        run pane, what happens if we try to do math on this number we input?
         */

//        int number = userString - 1;

        /*
        Ewwwww, red squiggles that's no good, this means we can't even compile our program there is an issue that java can't
        and won't handle on its own.

        Why do you think this is?

        When we initialized userString we explicitly told java this variable is going to be a string, treat anything
        that is put in by the user as a string.  So while we put in a number it is not treating it like a number that can
        be used in calculations but rather a string representation of the number.
         */

        /*
        Now, what if we want our user to input a number?

        Scanner has a lot of properties that we can use to read the input.  If we know our input has to be a number we
        use .nextInt();  This tells the scanner the user input that it is expecting has to be a whole number.  Lets try
        this out now.
         */
//        System.out.println("Enter a number: ");
//        int userNumber = input.nextInt();
//
//        System.out.println(userNumber);

        /*
        Awesome, so just like with the string we put in at first it recognized exactly what we put in.  What happens if
        we input a letter, string or even a decimal number instead on a whole number?  Try it and find out.

        InputMismatchException... This is Java's way of saying "Hey I'm expecting an integer here, I don't know what to
        do with anything else so Im going to quit the program here and give you some angry red text you're going to have
        to figure out the rest."  There is a way to account for these, we'll learn about that later.  For now, just
        focus on the fact that Java doesn't play well with getting an input type that it is not expecting.
         */

        /*
        So we see the basics of how Scanner allows us to utilise our users input for our program.  Take a few minutes
        to play around and see what other types of input we can have it accept.
         */

//        //Types of Strings for input
//        input.nextLine();
//        input.next();
//        //Doubles
//        input.nextDouble();
//        //Ints
//        input.nextInt();
//        //BigDecimals
//        input.nextBigDecimal();
//        //Booleans
//        input.nextBoolean();

        /*
        Scanner can even be used to check if the input has a specific thing.

        It will return a boolean (true or false)  to answer it it HAS something.  This is most commonly used in if
        statements
         */

        if(input.hasNextLine()) {
            //Do some stuff
        }
        //The ! stands for does not so this reads If input does not have a next line
        if(!input.hasNextLine()){
            //Do stuff again
        }

        /*
        The has next line is useful when parsing through text, whether it is user input or a text file on the system.

        There are quite a few more things that scanner can do but these are the most basic functions we will need it for.
         */



    }
}
