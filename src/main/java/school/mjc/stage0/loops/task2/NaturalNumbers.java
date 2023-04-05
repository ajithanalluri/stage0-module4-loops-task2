package school.mjc.stage0.loops.task2;

/*
* Write a program that will write to console numbers from zero to the number
* from method arguments using while loop, each on new line:
 */

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int i = 0;
        while (lastPrinted >= 0) {
            System.out.println(i);
            lastPrinted --;
            i++;
        }
    }
}
