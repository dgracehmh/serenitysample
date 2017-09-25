package com.serenity.maven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by graced on 21/09/2017.
 */
public class SerenityHomePage extends PageObject {


    @FindBy(id = "documentation")
    public WebElementFacade lnkDocumentation;

    @FindBy(id = "whatisserenity")
    public WebElementFacade lnkWhatIsSerenity;

    @FindBy(id = "home")
    public WebElementFacade serenityIcon;


    public void navigateToDocumentation() {
        lnkDocumentation.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void navigateToWhatIsSerenity() {
        lnkWhatIsSerenity.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void verifyIcon() {
        Assert.assertTrue("Serenity Icon is enabled", serenityIcon.isCurrentlyEnabled());
    }
}
