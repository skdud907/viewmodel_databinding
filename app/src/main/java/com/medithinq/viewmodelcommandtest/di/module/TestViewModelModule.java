package com.medithinq.viewmodelcommandtest.di.module;

import com.medithinq.viewmodelcommandtest.viewmodel.TestViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestViewModelModule {
    @Provides
    @Singleton
    public TestViewModel provideTestViewModel() { return new TestViewModel(); }
}
