package GroupIdQa;
import org.apache.log4j.Logger;

public class AllTasksInOneL2 {
    private static Logger LOG = Logger.getLogger(AllTasksInOneL2.class);
    public static void main(String[] args) {

    }

    public int calcSmallestNum(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public void calcAndPrintKratnoje4islo(int kratnoje) {
        int n = 20;
        int[] arr = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (i % kratnoje == 0) {
                arr[j++] = i;
                LOG.info(i);
            }
        }
    }


}
