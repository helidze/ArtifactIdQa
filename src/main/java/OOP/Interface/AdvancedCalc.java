package OOP.Interface;

public class AdvancedCalc implements Calc{
    @Override
    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    @Override
    public void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    @Override
    public void dev(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    @Override
    public void mult(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }
}
