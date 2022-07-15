package com.medithinq.viewmodelcommandtest.network;

import com.medithinq.viewmodelcommandtest.ActivityApplication;

import javax.inject.Inject;

public class TestDown implements ITestListener {
    @Inject
    Test test;

    public TestDown() {
        ActivityApplication.getActivityApplication().getITestComponent().inject(TestDown.this);
    }

    @Override
    public String Test() {
        return test.play();
    }
}
