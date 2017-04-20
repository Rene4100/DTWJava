package dk.rene4100;

public class Main {
    public static void main(String[] args) {
        double[] array1 = {1, 2, 3, 5, 5, 5, 6};
        double[] array2 = {1, 1, 2, 2, 3, 5 };

        System.out.println(DTW.DTWDistance(array1, array2));
    }

}
