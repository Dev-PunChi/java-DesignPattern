package Strategy;

public class MainEntry {
    public static void main(String[] args) {
        SumPrinter cal = new SumPrinter();
        cal.print(new SimpleSumStrategy(), 100);
        cal.print(new GaussSumStrategy(), 100);
    }
}
