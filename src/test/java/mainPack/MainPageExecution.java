package mainPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Test_SalePage.SalePage;
import Test_SignIn.SignIn;
import Test_VerifyPageTitle.VerifyPageTitle;
import Test_VerifySupportThisProjectPage.VerifySupportThisProjectPage;
import Test_VerifyWhatsNewPage.VerifyWhatsNewPage;
import Test_addToCart.addToCart;
import Test_addToCompare.compareProduct;
import Test_verifySearchOption.verifySearchOption;
import Test_wishlistRemoveAdd.wishlist;
import Test_women.women;
import test_FooterOptions.AdvancedSearch;
import test_FooterOptions.PracticeAPITestingUsingMagento2;
import test_FooterOptions.PrivacyCookiePolicy;
import test_FooterOptions.WriteForUs;
import test_FooterOptions.notes;
import test_FooterOptions.searchitem;
import test_FooterOptions.subscribe;

public class MainPageExecution {

	@Test
	public void mainTest() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		SignIn si = new SignIn(driver);
		VerifyPageTitle vt = new VerifyPageTitle(driver);
		verifySearchOption vs = new verifySearchOption(driver);
		VerifySupportThisProjectPage vi = new VerifySupportThisProjectPage(driver);
		VerifyWhatsNewPage vw = new VerifyWhatsNewPage(driver);
		women w = new women(driver);
		addToCart ad = new addToCart(driver);
		wishlist wl = new wishlist(driver);
		compareProduct co = new compareProduct(driver);
		SalePage sp = new SalePage(driver);
		searchitem sim = new searchitem(driver);
		PrivacyCookiePolicy pcp = new PrivacyCookiePolicy(driver);
		AdvancedSearch as = new AdvancedSearch(driver);
		notes N = new notes(driver);
		PracticeAPITestingUsingMagento2 ptm = new PracticeAPITestingUsingMagento2(driver);
		WriteForUs wfu = new WriteForUs(driver);
		subscribe Sb = new subscribe(driver);

		vt.url();
		si.clickOnSignIn();
		si.fillupSignIndata();
		vt.pageTitle();
		vi.VerifySupportThisProject();
		vs.verifySearch();
		vs.Searchwatermark();
		vw.VerifyWhatsnewpage();
		w.womenOptions();
		w.womenTopOptions();
		w.testJacketsDisplayed();
		ad.gearOption();
		ad.addInCart();
		ad.proceedToCheckout();
		ad.fillUpform();
		ad.Screenshot();
		wl.searchProduct();
		wl.addProductToWishlist();
		wl.removefromwishlist();
		co.FindingProduct();
		co.selectProducts();
		co.compare();
		sp.clickOnSale();
		sp.VerifySalepage();
		sim.Clickon_searchitem();
		pcp.Privacy_cookie_policy();
		as.Advanced_Search();
		N.Notes();
		ptm.Practice_APITesting_usingMagento2();
		wfu.Write_for_us();
		Sb.Subscribe();
		vt.closeBrowser();
	}

}
