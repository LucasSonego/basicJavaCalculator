package operations;

public class Add extends Operations{
    @Override
    public void calculate(double x, double y) {
        res = x + y;
        System.out.println(String.format("%.2f", res));
    }
}