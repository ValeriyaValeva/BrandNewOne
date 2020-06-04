package mytest;

import mytest.FirstTest;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SubTest1 extends FirstTest {

    @BeforeSuite
    public void doBeforeSuite1() {
        System.out.println("mytest.SubTest1/doBeforeSuite/ 1");
    }

    @BeforeTest
    public void doBeforeTest1() {
        System.out.println("mytest.SubTest1/doBeforeTest/2");
    }

    @BeforeClass
    public void doBeforeClass1() {
        System.out.println("mytest.SubTest1/doBeforeClass/3");
    }

    @BeforeMethod
    public void doBeforeMethod1() {
        System.out.println("mytest.SubTest1/doBeforeMethod/4");
    }

    @Test(groups = {"first", "second"})
    public void testCase1() {
        System.out.println("mytest.SubTest1/testCase1/5");
       /* Assert.assertEquals(2, "1");                          //Example 1. for both SoftAssert and Assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("1", 1, "failed asd");
        softAssert.assertAll(); */

       /* System.out.println("*** test case one started ***");      //Example 2. for Assert
        Assert.assertEquals(5, 5, "First hard assert failed");
        System.out.println("hard assert success....");
        Assert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
        System.out.println("*** test case one executed successfully ***"); */

       SoftAssert softAssert = new SoftAssert();                     //Example 3. for SoftAssert
        System.out.println("*** test case two started ***");
        softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
        System.out.println("hard assert success....");
        softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
        softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
        System.out.println("*** test case two executed successfully ***");
        softAssert.assertAll();



    }

    @AfterMethod
    public void doAfterMethod1() {
        System.out.println("mytest.SubTest1/doAfterMethod/6");
    }

    @AfterClass
    public void doAfterClass1() {
        System.out.println("mytest.SubTest1/doAfterClass/7");
    }

    @AfterTest
    public void doAfterTest1() {
        System.out.println("mytest.SubTest1/doAfterTest/8");
    }

    @AfterSuite
    public void doAfterSuite1() {
        System.out.println("mytest.SubTest1/doAfterSuite/9");
    }

}
