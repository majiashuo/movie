package test;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import listener.WebtestListener;
import manage.AddMovieClass;
import manage.LoginClass;

public class FrontEndMyMovie extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
		TestRunner runner = (TestRunner) context;
		
	    runner.addListener(new WebtestListener());
	   
	}
    @Test
    public void testLogin() {
    	LoginClass add=new LoginClass(webtest);
    	add.inputValuesSeccess("admin", "admin");
    	
    }
    @Test(dependsOnMethods="testLogin")
    public void addMovie() throws InterruptedException {
    	AddMovieClass addM=new AddMovieClass(webtest);
    	addM.inputValues("肖申克", "xiao", "谁", "ying", "美国", "English", "2000-02-21", "121", "D:\\\\pictures\\\\517098.jpg");
    }
}
