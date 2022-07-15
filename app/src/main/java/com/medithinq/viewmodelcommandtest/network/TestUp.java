package com.medithinq.viewmodelcommandtest.network;

import com.medithinq.viewmodelcommandtest.ActivityApplication;

import javax.inject.Inject;

public class TestUp implements ITestListener {
    @Inject
    Test test;

    public TestUp() {
        ActivityApplication.getActivityApplication().getITestComponent().inject(TestUp.this);
    }

    @Override
    public String Test() {
        return test.pause();
    }
}
