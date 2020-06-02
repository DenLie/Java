package Tasks;

public class Task1 {
    public static void main(String[] msi) {

    }

    //задача #1
    public static int remainder(int a, int b) {
        return a % b;
    }

    //задача #2
    public static float triArea(int a, int b) {
        return (float) (a * b) / 2;
    }

    //задача #3
    public static int animals(int chickens, int pig, int cow) {
        return chickens * 2 + pig * 4 + cow * 4;
    }

    //задача #4
    public static boolean profitableGamble(float prob, int prize, int pay) {
        return prob * prize > pay;
    }

    //задача #5
    public static String operation(int a, int b,int s) {
        if ((b - a == s) | (a - b == s)) return "substacted";
        if ((b + a == s)) return  "added";
        if ((b / a == s) | (a / b == s)) return  "division";
        if ((b * a == s)) return  "multiplication";
        return "none";
    }

    //задача #6
    public static int ctoa(String s) {
        return s.charAt(0);
    }

    //задача #7
    public static int addUpTo(int a) {
        int s = 0;
        for (int i = 0; i <= a; i++) s += i;
        return (s);
    }

    //задача #8
    public static int nextEdge(int a, int b) {
        return (a + b - 1);
    }

    //задача #9
    public static int sumOfCubes(int... a) {
        int s = 0;
        for (int i : a) {
            s += Math.pow(i, 3);
        }
        return (s);
    }

    //задача #10
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return (a % c == 0);
    }
}
