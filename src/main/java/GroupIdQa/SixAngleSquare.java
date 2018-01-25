package GroupIdQa;

public class SixAngleSquare extends TriangleSquare {
    public static void main(String[] args) {
        SixAngleSquare sixAngleSquare = new SixAngleSquare();
        sixAngleSquare.getSixAngleSquare();
    }

    void getSixAngleSquare() {
        double S = 6 * getTriangleSquare();
        System.out.println("Площадь шестиугольника = " + S);
    }
}
