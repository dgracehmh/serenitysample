package com.serenity.maven.testsuites;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by graced on 21/09/2017.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RunnableFeature.feature")
public class SerenityTestSuite {
}
