package Myhooks;

import io.cucumber.java.*;

public class AmazonHooks {
    @Before("@Smoke")
    public void setup_applicaion(Scenario sc){
        System.out.println("launch amazon application");
        System.out.println(sc.getName());
    }
//    @Before(order=2)
//    public void setup_url(){
//
//    }
//    @After(order=1)
//    public void teardown_close(Scenario sc){
//        System.out.println("close the browser");
//        System.out.println(sc.getName());
//    }
    @After("@Smoke")
    public void teardown_logout(){
        System.out.println("logout from application");
    }
//    @BeforeStep
//    public void takescreenshot(){
//        System.out.println("take the screenshot");
//    }
//    @AfterStep
//    public void refreshPage(){
//        System.out.println("refresh the page ");
//    }
}
