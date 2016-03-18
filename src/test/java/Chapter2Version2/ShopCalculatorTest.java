package Chapter2Version2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/18.
 */
public class ShopCalculatorTest {

    ShopCalculator cal = new ShopCalculator();


    @Before
    public void setUp() throws Exception {}

    //POSITIVE TESTS
    @Test  //Testing for Floating point
    public void testingForFloatingPostiveTest() throws Exception {

        float answer= cal.floatNumber(3,00);
        Assert.assertTrue(answer ==3.00);
    }
    //NEGATIVE TESTS------Test Fails
    @Test  //Testing for Floating point
    public void testingForFloatingNegativeTest() throws Exception {

        float answer= cal.floatNumber(4,00);
        Assert.assertTrue(answer ==5.00);
    }


    //POSITIVE TESTS
    @Test  //Testing for Object Eqaulity
    public void PostiveTestForObjectEqaulity() throws Exception {
        Assert.assertSame(cal.FirstName(),"Sbu");
    }

    //NEGATIVE TESTS------Test Fails
    @Test  //Testing for Object Eqaulity
    public void NegativeTestForObjectEqaulity() throws Exception {
        Assert.assertSame(cal.FirstName(),"Mnisi");
    }


    //POSITIVE TESTS------Test Fails
    @Test  //Testing for Nullness
    public void PostiveTestForNullness() throws Exception {

        Assert.assertNull(cal.nullValue(), null);
    }

    //NEGATIVE TESTS------Test Fails
    @Test  //Testing for Nullness
    public void NegativeTestForNullness() throws Exception {

        Assert.assertNull(cal.nullValue(),"Sibusiso Mnisi");
    }

    //POSITIVE TESTS
    @Test  //Testing for Not Null
    public void PostiveTestForNotNull() throws Exception {
        Assert.assertNotNull(cal.FirstName());
    }


    //NEGATIVE TESTS------Test Fails
    @Test  //Testing for Not Null
    public void NegativeTestForNotNull() throws Exception {
        Assert.assertNotNull(cal.nullValue());
    }


    //POSITIVE TESTS
    @Test  //Testing for List
    public void PostiveTestForList() throws Exception {
        List testList = new ArrayList();

        testList.add("Mnisi");
        testList.add("Sibusiso");

        Assert.assertEquals(testList,cal.returnList());
    }



    //NEGATIVE TESTS------Test Fails
    @Test  //Testing for List
    public void NegativeTestForList() throws Exception {
        List testList = new ArrayList();
        testList.add("Mnisi");
        Assert.assertEquals(testList,cal.returnList());
    }

    @After
    public void tearDown() throws Exception {}
}
