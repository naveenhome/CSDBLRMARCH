package csdblr;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class NewRxSteps extends TestCase{
	RxData rxData = new RxData();
	RxService rxService; 
	@Given("^Patient enter valid prescription data$")
	public void inputDate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		rxData.setpName("Naveen");
		
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^System display \"([^\"]*)\" with \"([^\"]*)\" button$")
	public void system_display_with_button(String message, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		rxService = new RxService();
		
	}

	@Then("^clicking on \"([^\"]*)\" will take patient on \"([^\"]*)\" page$")
	public void expectedResult(String message, String bName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		assertEquals(message, rxService.validate(rxData));
	}

	@Then("^patient can see newly added prescription on \"([^\"]*)\" Page$")
	public void patient_can_see_newly_added_prescription_on_Page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^Patient enter name as \"([^\"]*)\" and doctor name as \"([^\"]*)\" visit date as \"([^\"]*)\" and time is \"([^\"]*)\" and image file name is \"([^\"]*)\" and \"([^\"]*)\"$")
	public void inputDataWithValue(String pName, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		rxData.setpName(pName);
		
	}



}
