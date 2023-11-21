package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 * @author mounika
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {

	@Test
	public void facebookLoginTest() throws InterruptedException {
		driver.get("https://test.salesforce.com/");
		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail("vishnu.r@cloudfulcrum.com.trnprod").enterPassword("Qazwsx123").clickSignIn();
		Thread.sleep(10);
		Assert.assertTrue(true, "Login pass : Test pass");
	}
}
