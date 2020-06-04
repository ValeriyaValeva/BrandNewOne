package mytest;

import org.testng.Reporter;
import org.testng.annotations.*;

public class FirstTest {
    // @Parameters ({"firstName"})
    // @Test (dependsOnMethods = {"alwaysRun=true"})

    @BeforeSuite
    public void doBeforeSuite() {
        System.out.println("mytest.FirstTest/doBeforeSuite/ 1");
    }

    @BeforeTest
    public void doBeforeTest() {
        System.out.println("mytest.FirstTest/doBeforeTest/2");
    }

    @BeforeClass
    public void doBeforeClass() {
        System.out.println("mytest.FirstTest/doBeforeClass/3");
    }

    @BeforeMethod
    public void doBeforeMethod() {
        System.out.println("mytest.FirstTest/doBeforeMethod/4");
    }

    @Test(groups = {"first"})
    public void testCase() {
        System.out.println("mytest.FirstTest/testCase1/5");
        Reporter.log("TestCase1 is successfully printed out");
        System.out.println("The cat has fluffy tail and brown eyes");
        Reporter.log("The cat details were printed out successfully");

    }

    @AfterMethod
    public void doAfterMethod() {
        System.out.println("mytest.FirstTest/doAfterMethod/6");
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("mytest.FirstTest/doAfterClass/7");
    }

    @AfterTest
    public void doAfterTest() {
        System.out.println("mytest.FirstTest/doAfterTest/8");
    }

    @AfterSuite
    public void doAfterSuite() {
        System.out.println("mytest.FirstTest/doAfterSuite/9");
    }

}
