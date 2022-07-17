package Strategy;

public class GaussSumStrategy implements SumStrategy {

    @Override
    public int get(int n) {
        System.out.println("GaussSumStrategy");
        return (n + 1) * n / 2;
    }
}
