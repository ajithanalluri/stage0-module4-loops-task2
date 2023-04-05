package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i=0;
        while (printTillInclusive >=0) {
            if(i%2 == 0)
                System.out.println(i);
            i++;
            printTillInclusive--;
        }
    }
}
