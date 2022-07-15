package com.medithinq.viewmodelcommandtest.di.module;

import com.medithinq.viewmodelcommandtest.network.ITestListener;
import com.medithinq.viewmodelcommandtest.network.Test;
import com.medithinq.viewmodelcommandtest.network.TestDown;
import com.medithinq.viewmodelcommandtest.network.TestUp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    @Singleton
    public ITestListener provideITestListener() {
        return new TestUp();
    }

    @Provides
    @Singleton
    public Test provideTest() {
        return new Test();
    }
}
