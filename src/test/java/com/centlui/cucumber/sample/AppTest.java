package com.centlui.cucumber.sample;

import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"json:target/json-report/applications.json"}
        , features = {"classpath:features/app/"}
        , glue = {"com.centlui.cucumber.sample.app"}
        , tags = {"@app"}
)
public class AppTest {
    private static final Logger log = LoggerFactory.getLogger(AppTest.class);

    public static void main(String[] args) {
        try {
            System.err.println(System.getProperty("basedir"));
            String targetDir = "/Users/LvShuangTao/GitRepos/CucumberReports/cucumber-sample/target/";//System.getProperty("basedir") + "/target/";


            File reportOutputDirectory = new File(targetDir + "html-report/");
            List<String> list = new ArrayList<String>();
            list.add(targetDir + "json-report/applications.json");

            String pluginUrlPath = "";
            String buildNumber = "1";
            String buildProject = "cucumber-jvm";
            boolean skippedFails = true;
            boolean pendingFails = true;
            boolean undefinedFails = true;
            boolean missingFails = true;
            boolean flashCharts = true;
            boolean runWithJenkins = false;
            boolean highCharts = true;
            boolean parallelTesting = false;
            ReportBuilder reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
                    buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins,
                    highCharts, parallelTesting);
            reportBuilder.generateReports();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Exception encounter while generating the fancy cucumber html report.", e);
            Assert.fail("Exception encounter while generating the fancy cucumber html report, detailed exception is: "
                    + e.getMessage());
        }
    }
}
