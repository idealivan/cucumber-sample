package com.centlui.cucumber.sample.app;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

/**
 * <p>
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 * </p>
 * Created at 2015-12-19 16:29 by by @author : 风樵(shuangtao.lst@alibaba-inc.com)
 * Project : wdm-test
 * Description :
 */
public class AppOperationStepDefs {
    private static final Logger log = LoggerFactory.getLogger(AppOperationStepDefs.class);

    @Given("^我以用户\"([^\"]*)\"和\"([^\"]*)\"登录到系统然后输出用例简述\"([^\"]*)\"$")
    public void 我以用户_和_登录到系统然后输出用例简述(String userName, String userPassword, String caseComment) throws Throwable {
        log.info(MessageFormat.format("Arguments are: {0}, {1} and {2}", userName, userPassword, caseComment));
        Assert.assertTrue("Fake case assertion.", Boolean.TRUE);
    }


    @When("^我使用参数\"([^\"]*)\"和\"([^\"]*)\"访问了URL \"([^\"]*)\"$")
    public void 我使用参数_和_访问了URL(String method, String tabType, String url) throws Throwable {
        log.info(MessageFormat.format("Arguments are: {0}, {1} and {2}", method, tabType, url));
        Assert.assertTrue("Fake case assertion.", Boolean.TRUE);
    }


    @Then("^返回的JSON数据应该包括\"(.*)\"所期望的内容$")
    public void 返回的JSON数据应该包括_所期望的内容(String expectedStr) throws Throwable {
        log.info(MessageFormat.format("Arguments are: {0}", expectedStr));
        Assert.assertTrue("Fake case assertion.", Boolean.TRUE);
    }

    @And("^返回JSON数据反序列化之后应当是ApplicationDetailBean的实例列表$")
    public void 返回JSON数据反序列化之后应当是ApplicationDetailBean的实例列表() throws Throwable {
        log.info("Final step of this test.");
        Assert.assertTrue("Fake case assertion.", Boolean.TRUE);
    }
}
