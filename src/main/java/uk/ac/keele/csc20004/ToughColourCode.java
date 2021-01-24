/* ***********************
 * CSC-20004 PRACTICAL 1 *
 * Date: 3 Feb 2021      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Random;

/** The class holding the sequence of 4 pegs representing the hidden
 *  colour code, or the guess. It extends the basic class and makes the
 *  guess more difficult by not revealing the number of pegs with correct
 *  colour but wrong position.
 *
 * @see ColourCode
 * @author Marco Ortolani
 */
public class ToughColourCode extends ColourCode {
    /** Constructor for the ColourCode, using a string for initialisation
     *  (see {@link ColourPeg#RED} for an example of the allowed colours)
     *
     * @param colourString a string of 4 characters, each representing the initial of a colour
     * @see ColourPeg
     */
    public ToughColourCode(String colourString) {
      super(colourString);
    }

    /** Compares this code to another, relying on the superclass method it
     *  overrides. Then it get rid of the first digit (the 'C' part of the score)
     *  by way of the modulo operator (which returns the remainder of the division)
     *
     * @see ColourCode#compareTo
     *
     * @param masterCode the code to check against
     * @return a two digit integer; the first digit C is always 0, while second digit P
     * indicates how many are of the correct colour and in the right place.
     */
    @Override
    public int compareTo(ColourCode masterCode) {
      return super.compareTo(masterCode) %10;
    }

}
