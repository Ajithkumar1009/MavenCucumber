package org.cuc.MavenCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\main\\java",glue= {"org.cuc.MavenCucumber"},plugin= {"html:target"})

public class TestRunner {

}
