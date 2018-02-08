package OOP.Interface;

public class Engineering implements Calc {

    public static void main(String[] args) {
        Engineering engineering = new Engineering();
        engineering.add(1, 2);
        engineering.sub(1, 2);
        engineering.dev(1, 2);
        engineering.mult(1, 2);
        AdvancedCalc advancedCalc = new AdvancedCalc();
        advancedCalc.add(1, 2);
        advancedCalc.sub(1, 2);
        advancedCalc.dev(1, 2);
        advancedCalc.mult(1, 2);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a + b + "sum");
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a - b + "minus");
    }

    @Override
    public void dev(int a, int b) {
        System.out.println(a / b + "delitb");
    }

    @Override
    public void mult(int a, int b) {
        System.out.println(a * b + "umnojatb");
    }
}

