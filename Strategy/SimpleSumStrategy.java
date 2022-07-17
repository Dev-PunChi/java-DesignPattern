package Strategy;

public class SimpleSumStrategy implements SumStrategy {

    @Override
    public int get(int n) {
        System.out.println("SimpleSumStrategy");
        int sum = n;
        for (long i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
