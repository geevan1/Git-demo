package testsuite;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class geevan114 {
	@Parameters({"URL","URL1"})
	@Test
	public void demo1(String urlname, String  urlname1) {
		System.out.println(urlname);
		System.out.println(urlname1);
	}

@Test(dataProvider="getData")
public void Bclass( String username, String Password) {
	System.out.println(username);
	System.out.println(Password);

}
}
