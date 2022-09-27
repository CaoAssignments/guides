/**
 * Name:
 * Email:
 * PID:
 * Sources used: Put "None" if you did not have any external help
 * Some example of sources used would be Tutors, Textbook, and Lecture Slides
 * 
 * This file is used to demonstrate what a properly styled file looks like.
 * It comes with class and method headers samples that you can use as a
 * template for styling your assignment files. (Remember 1-4 sentences)
 */

// If there are imports, they should go here.
import java.util.Scanner;

/**
 * This class stores two numbers and is able to perform simple arithmetic
 * operations. It can also display its stored numbers. (Remember 1-2 sentences)
 * 
 * Instance variables: (these won't come up until future PAs)
 * firstNum - The first number that is stored by the class
 * secondNum - The second number that is stored by the class
 */
public class SampleFile {

    /** Constants (Magic Numbers) */
    // Labels for the printing of the numbers
    private static final String FIRST_NUM_LABEL = "Num 1: ";
    private static final String SECOND_NUM_LABEL = "Num 2: ";

    // Example of really long constant
    private static final String REALLY_LONG_CONSTANT = "This line is very long"
            + " and here is some more text to fill up this line. Maybe I want"
            + " another line of text so here it is.";

    /** Instance variables */
    private int firstNum;
    private int secondNum;

    /**
     * The constructor initializes the two numbers that will be used
     * in this class's arithmetic operations.
     * 
     * @param firstNum  Value to set the instance variable firstNum to
     * @param secondNum Value to set the instance variable secondNum to
     */
    public SampleFile(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    /**
     * This method computes the sum of firstNum and secondNum.
     *
     * @return Sum of firstNum and secondNum
     */
    public int add() {
        return this.firstNum + this.secondNum;
    }

    /**
     * This method computes the product of firstNum and secondNum
     * using addition.
     * 
     * @return Product of firstNum and secondNum
     */
    public int multiply() {
        int total = 0;

        /*
         * Generally speaking, a good way of knowing when an inline comment
         * should be added is when you have a large chunk of code that is
         * tasked with performing some operation. Here, I left a comment since
         * it may not be clear why I'm adding this.firstNum to total.
         * 
         * In some other cases, you may have a while loop that is tasked with
         * finding the minimum value in an array which will be used for some
         * other tasks. In that case, it would be appropriate to leave a
         * comment saying "Preprocessing to find the minimum value for __ task"
         */

        // Implement multiplication by adding firstNum secondNum times
        for (int i = 0; i < Math.abs(this.secondNum); i++) {
            total += this.firstNum;
        }

        return total;
    }

    /**
     * This method prints to the console the values that firstNum and
     * secondNum are set to.
     */
    public void printNumbers() {
        System.out.println(FIRST_NUM_LABEL + this.firstNum);
        System.out.println(SECOND_NUM_LABEL + this.secondNum);
    }

    /**
     * This method contains a couple of different cases that you may encounter
     * while implementing some of the PAs. This method also provides an example
     * of what you should do if the entire method header goes over 80 chars.
     * 
     * @param firstParameter  Placeholder parameter #1
     * @param secondParameter Placeholder parameter #2
     * @param thirdParameter  Placeholder parameter #3
     * @param fourthParameter Placeholder parameter #4
     */
    public void superLongMethodName(int firstParameter, String secondParameter,
            int thirdParameter, int fourthParameter) {

        // Breaking up a long conditional
        /*
         * The important thing to point out here is that there is more than one
         * way to break up these long lines. You should be consistent with the way
         * the breaking of the lines are aligned. Here, each additional line in
         * the condition (or similar block) is indented with one tab.
         * 
         * As seen in the style guidelines, this also applies to other long lines
         * such as long method calls or arithmetic operations. Keep the additional
         * lines aligned with the same standard, whether it be aligned with a tab
         * or be aligned by a space after the equals sign.
         */
        if (firstParameter > thirdParameter
                && fourthParameter < secondParameter.charAt(0)) {

        } else if (firstParameter + thirdParameter < fourthParameter
                || thirdParameter == firstParameter) {

        }
    }
}