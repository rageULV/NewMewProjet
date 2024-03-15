package tests;

import config.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LetTheCarWorkPage;
import pages.LogInPage;
import pages.TopMenuItem;

public class TestClass extends BaseTest {
    @Test
    public void checking_LTCWP_Methods()throws InterruptedException{
        HomePage hp = new HomePage(getDriver());
        LetTheCarWorkPage ltcwp = hp.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);
        ltcwp.setManufacturer("BMW").
                addLocation("Montana").
                setFuelType().
                photoAttachment("E:\\QA things\\pictures\\illcaro\\bmw.jpg");
        Thread.sleep(5000);
    }
    @Test
    public void checkingIfItWorks() throws InterruptedException {
       HomePage hp = new HomePage(getDriver());
       LogInPage logInPage = hp.openTopMenu(TopMenuItem.LOGIN);
       logInPage.tryToFindAnElement();
//       LetTheCarWorkPage lcwp = logInPage.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);
//       lcwp.setManufacturer("BMW").addLocation("Montana")
//               .setFuelType().photoAttachment("C:\\Pictures\\BlueCar.jpg");
       Thread.sleep(3000);
    }
}
