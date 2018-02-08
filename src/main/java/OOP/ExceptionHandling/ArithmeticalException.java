package OOP.ExceptionHandling;

import org.apache.log4j.Logger;

public class ArithmeticalException {
    private static final Logger LOG = Logger.getLogger(ArithmeticalException.class);

    public static void main(String[] args) {
        LOG.info("Program Starts");
        try {
            int c = 10/0;
            LOG.info(c);
        }
        catch (Exception e){
            LOG.error("Делить на ноль нельзя " + e);
        }


    }
}
