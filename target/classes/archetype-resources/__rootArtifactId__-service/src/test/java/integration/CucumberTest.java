#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integration;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {
                "progress",
                "json:target/cucumber-report.json"
        },
        glue = {
                "com.abeldevelop.architecture.library.test.integration.cucumber",
                "${package}.integration"
        }
)
public class CucumberTest {

}
