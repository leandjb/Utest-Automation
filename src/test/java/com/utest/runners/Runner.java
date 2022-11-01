package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/transactions_wompi.feature",
        glue = "com.utest.steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}
