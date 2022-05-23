package com.example.steps;

import com.example.app.pages.ListPage;
import io.cucumber.java.en.When;

public class ListPageStepDefs {

    ListPage listPage = new ListPage();

    @When("user do swipe up on list data")
    public void userDoSwipeUpOnListData() {
        listPage.swipeUp();
    }

    @When("user do Long Press on list data")
    public void userDoLongPressOnListData() {
        listPage.swipeUp();
    }

    @When("user do Tap Multiple Times on list data")
    public void userDoTapMultipleTimesOnListData() {
        listPage.swipeUp();
    }
}
