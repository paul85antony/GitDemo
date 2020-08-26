package service;

import domain.pages.ExpediaHomePage;
import domain.pages.MyTripsPage;

public class NavigationService {

    private static ExpediaHomePage homePage;
    private static MyTripsPage tripPage;


    public void openHomePage() {

        homePage = ExpediaHomePage.open();


    }

    public void selectSignInLink() {
        homePage.selectSignInLink();
    }
}
