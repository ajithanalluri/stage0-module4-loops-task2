package school.mjc.stage0.loops.task2;

/*
*Write a program that will write to console multiplied numbers by input from zero to the number
*  from method arguments using while loop, each on new line
* (program should also be able to work with negatives):
 */
public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i;
        int number = 1;
        int count;

        while(number <= printToInclusive)
        {
            count = 0;
            i = 2;
            while(i <= number/2 )
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && number != 1 )
            {
                System.out.println(number);
            }
            number++;
        }
    }
}
