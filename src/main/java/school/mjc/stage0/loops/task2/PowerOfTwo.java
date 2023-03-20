package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 1;
        int j = 1;
        while (j < power + 1) {
            System.out.println(i);
            i *= 2;
            j++;
        }
    }
}
