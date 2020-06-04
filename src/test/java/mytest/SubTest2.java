package mytest;

import mytest.FirstTest;
import org.testng.Reporter;
import org.testng.annotations.*;

public class SubTest2 extends FirstTest {

    @BeforeSuite
    public void doBeforeSuite2() {
        System.out.println("mytest.SubTest2/doBeforeSuite/ 1");
    }

    @BeforeTest
    public void doBeforeTest2() {
        System.out.println("mytest.SubTest2/doBeforeTest/2");
    }

    @BeforeClass
    public void doBeforeClass2() {
        System.out.println("mytest.SubTest2/doBeforeClass/3");
    }

    @BeforeMethod
    public void doBeforeMethod2() {
        System.out.println("mytest.SubTest2/doBeforeMethod/4");
    }

    @Test
    public void testCase2() {
        System.out.println("mytest.SubTest2/testCase1/5");
        Reporter.log("The message is printed");
    }

    @AfterMethod
    public void doAfterMethod2() {
        System.out.println("mytest.SubTest2/doAfterMethod/6");
    }

    @AfterClass
    public void doAfterClass2() {
        System.out.println("mytest.SubTest2/doAfterClass/7");
    }

    @AfterTest
    public void doAfterTest2() {
        System.out.println("mytest.SubTest2/doAfterTest/8");
    }

    @AfterSuite
    public void doAfterSuite2() {
        System.out.println("mytest.SubTest2/doAfterSuite/9");
    }


}
