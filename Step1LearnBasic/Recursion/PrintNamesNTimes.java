package Step1LearnBasic.Recursion;

public class PrintNamesNTimes {
    public static void main(String[] args) {
        printGfg(12);
    }

    static void printGfg(int n) {
        if (n == 0) return;
        System.out.print("RONY ");
        printGfg(n - 1);
}
}
