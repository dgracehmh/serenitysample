package com.serenity.maven.testsuites.steps.serenity;

import com.serenity.maven.config.EnvironmentConfiguration;
import com.serenity.maven.pages.SerenityHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by graced on 21/09/2017.
 */
public class SerenityPageSteps extends ScenarioSteps {


    @Steps
    private SerenityHomePage serenityHomePage;

    @Step
    public void openSerenityUrl() {
        serenityHomePage.openAt(EnvironmentConfiguration.getValue("serenity.url"));
    }

    @Step
    public void navigateToDocumentation() {
        serenityHomePage.navigateToDocumentation();
    }

    @Step
    public void navigateToWhatIsSerenity() {
        serenityHomePage.navigateToWhatIsSerenity();
    }

    @Step
    public void verifySerenityIcon() {
        serenityHomePage.verifyIcon();
    }

}
