/**
 * Oleg's learning problem (about arrays)
 */

package trainingFromOleg.checkArray;


/**
 *
 * the class checks the array for homogeneity
 *(if all the elements are the same, then output true)
 */


public class Check {

    /**
     *
     * @param data
     * @return
     * checks if all elements are the same,
     * brute force, then we give the truth
     */
    public boolean mono(boolean[] data) {

        boolean result = true;      // тригер
        boolean temp = data[0];     // first element

        for (int i = 1; i < data.length ; i++) {

            if (temp != data[i]){
                result  = false;
            }

        }
        return result;
    }
}

