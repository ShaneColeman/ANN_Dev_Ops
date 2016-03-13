import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Windows on 13/03/2016.
 */
public class DataSetTrainTest {

    @Test
    public void testSetTotalInputsOutputs() throws Exception
    {
        int x = 8;
        int y = 4;

        int expected = 12;

        DataSetTrain train = new DataSetTrain(x,y);
        train.setTotalInputsOutputs(x,y);

        int actual = train.getTotalInputsOutputs();

        org.junit.Assert.assertEquals(expected,actual);
    }
}