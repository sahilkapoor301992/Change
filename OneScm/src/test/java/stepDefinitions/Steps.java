package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;




public class Steps {
    WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        System.setProperty("webdriver.chrome.driver","D:\\DOWNLOAD\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://clearorbit.hrbl.com/endeavour/index.jsp");
    }
    @And("^User enters incorrect UserName and incorrect Password$")
    public void user_enters_UserName_and_Password() {
        // Write code here that turns the phrase above into concrete actions
 WebElement Username=driver.findElement(By.xpath("//input[@name='j_username']"));
 Username.sendKeys("abc");
        WebElement Password=driver.findElement(By.xpath("//input[@name='j_password']"));
        Password.sendKeys("abc");
        driver.findElement(By.name("btnLogin")).click();


    }
    @Then("^Message displayed Login Denied$")
    public void message_displayed_Login_Denied(){
        System.out.print("Login_Denied");
        // Write code here that turns the phrase above into concrete actions

    }
        // Write code here that turns the phrase above into concrete actions

}
