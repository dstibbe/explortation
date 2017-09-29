package nl.dstibbe.example.fizzbuzz;

import static java.lang.System.exit;

/**
 * Application for running FizzBuzz
 *
 * Usage:  FizzBuzzApp {nr of rounds}
 */
public class FizzBuzzApp {

    public static void main(String[] args){
        //Check that there is 1 argument provided
        if( args.length != 1 ){
            System.err.println("Usage: FizzBuzzApp {nr of rounds}");
            exit(1); // exit the complete application with error code 1
        }

        long rounds = Long.valueOf(args[0]);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.playUntil(rounds);

    }
}
