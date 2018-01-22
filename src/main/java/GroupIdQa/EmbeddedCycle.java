package GroupIdQa;

public class EmbeddedCycle {
    public static void main(String[] args) {
        zeroTriangle(2);
    }

    public static void zeroTriangle(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("0");
            System.out.println();
        }
    }
}
