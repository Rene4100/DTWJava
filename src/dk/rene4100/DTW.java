package dk.rene4100;

public class DTW {
    private static int inf = 9000;

    public static double DTWDistance(double[] s, double[] t){
        double[][] dtw = new double[s.length + 1][t.length + 1];

        dtw[0][0] = 0;
        for (int i = 1; i <s.length + 1; i++) {
            dtw[i][0] = inf;
        }
        for (int i = 1; i <t.length + 1; i++) {
            dtw[0][i] = inf;
        }

        for (int i = 1; i < s.length + 1; i++) {
            for (int j = 1; j < t.length + 1; j++) {
                double cost = distanceD(s[i - 1], t[j - 1]);
                dtw[i][j] = cost + minimum(dtw[i - 1][j],      //match
                                           dtw[i][j - 1],      //insertion
                                           dtw[i - 1][j - 1]); //deletion
            }
        }
        return dtw[s.length][t.length];
    }

    private static double distanceD(double a, double b) {
        return Math.abs(a-b);
    }

    ///Finds the lowest value and returns it
    private static double minimum(double i, double i1, double i2) {
        if (i < i1) {
            if (i < i2) {
                return i;
            }
        } else if (i1 < i2) {
            return i1;
        }
        return i2;
    }
}
