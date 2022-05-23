package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class CalculatorPage extends BasePageObject {

    public void inputAngkaSatu(Integer angka1) {
        type2(MobileBy.id("et_1"), angka1);
    }

    public void inputAngkaDua(Integer angka2) {
        type2(MobileBy.id("et_2"), angka2);
    }

    public void clickDropDownBtn() {
        click(MobileBy.id("spinner_1"));
    }
    public void clickAddBtn() {
        click(MobileBy.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[@index='0']"));
    }

    public void clickEqualValue() {
        click(MobileBy.id("acb_calculate"));
    }
}
