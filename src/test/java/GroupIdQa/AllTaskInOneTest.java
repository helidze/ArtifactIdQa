package GroupIdQa;

import GroupIdQALevel2.AllTasksInOneL2;
import org.testng.annotations.Test;

public class AllTaskInOneTest {

    AllTasksInOneL2 l2 = new AllTasksInOneL2();

    @Test(priority = 1)
    private void getSmallNumber() {
        System.out.println("Меньшее число ---> " + l2.calcSmallestNum(5, 2));
    }

    @Test(priority = 2)
    private void getKratnoje() {
        l2.calcAndPrintKratnoje4islo(5);

    }


}
