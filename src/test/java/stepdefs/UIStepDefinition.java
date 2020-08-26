package stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import service.NavigationService;
import service.ValidationService;

public class UIStepDefinition {


    private static NavigationService navigationService;
    private static ValidationService validationService;


    public UIStepDefinition(NavigationService navigationService, ValidationService validationService){
        this.navigationService = navigationService;
        this.validationService = validationService;
    }

    public void setUp(){
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(navigationService);
        pico.addComponent(validationService);

    }

    @Given("^The user is in expedia home page$")
    public void the_user_is_in_expedia_home_page()  {

        navigationService.openHomePage();
        System.out.println("Inside Expedia Home Page");
        System.out.println("This is an change for git study");


        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User select the login button$")
    public void user_select_the_login_button()  {
        navigationService.selectSignInLink();

        System.out.println("Sign In Clicked");

        // Write code here that turns the phrase above into concrete actions

    }

    @And("^User provide the username and password$")
    public void user_provide_the_username_and_password()  {
        System.out.println("Inside the and method");

        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User should be logged in to the site$")
    public void user_should_be_logged_in_to_the_site() {

        System.out.println("Inside the then method");

        // Write code here that turns the phrase above into concrete actions

    }


}
