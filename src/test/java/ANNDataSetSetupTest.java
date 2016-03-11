
import static org.junit.Assert.*;

import org.junit.Assert;
import org.neuroph.core.data.DataSet;


/**
 * Created by Windows on 11/03/2016.
 */
public class ANNDataSetSetupTest {

    @org.junit.Test
    public void testSetColumnNames() throws Exception
    {
        //setColumnNames Unit Test Method
        DataSet data = DataSet.createFromFile("C:\\Users\\Windows\\Desktop\\TestingDataSet50.txt", 8, 4, "\t", false);

        ANNDataSetSetup ann = new ANNDataSetSetup();

        ann.setColumnNames(data);

        int expected = 12;
        int actual = 12;

        Assert.assertEquals(expected,actual);
    }
}