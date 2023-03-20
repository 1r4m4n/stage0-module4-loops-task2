package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int j = 1;
        while (i < printToInclusive + 2) {
            System.out.println(j);
            j *= i;
            i++;
        }
    }
}
