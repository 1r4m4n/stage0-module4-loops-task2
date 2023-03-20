package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 3;
        while (i < printToInclusive / 2) {
            int j = 2
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.println(i);
            }
            i++;
        }
    }
}
