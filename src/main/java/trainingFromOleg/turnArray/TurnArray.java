package trainingFromOleg.turnArray;

/*
class TurnArray reverse the array backwards
 */

public class TurnArray {

    public static int[] back (int[] input) {



        // array null, empty and one element array
        if (input == null || input.length <= 1) {
            return input;
         }


        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        return input;
    }
}
