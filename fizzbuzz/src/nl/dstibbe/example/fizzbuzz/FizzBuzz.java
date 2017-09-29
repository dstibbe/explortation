package nl.dstibbe.example.fizzbuzz;


/**
 * Class containing the actual fizz buzz logic.
 */
public class FizzBuzz {

    /**
     * Play fizz buzz until a certain amount of rounds.
     *
     * The results for all rounds are printed.
     * @param rounds nr of rounds to play (inclusive)
     */
    public void playUntil(long rounds){
        for(int round=1; round <= rounds; round++){
            this.play(round);
        }
    }

    /**
     * Play a given round
     *
     * Prints the result for the given round.
     *
     * @param round round to play
     */
    private void play(long round){
        String output = "";
        if( 0 == round % 3 ){
            output = output + "Fizz ";
        }
        if( 0 == round % 5 ){
            output = output + "Buzz ";
        }

        // Example demonstrating how to extend the logic:

//        if( 0 == round % 7 ){
//            output = output + "Monkey ";
//        }

        if( output.isEmpty()  ){
            output = output + round;
        }

        System.out.println(output);
    }
}
