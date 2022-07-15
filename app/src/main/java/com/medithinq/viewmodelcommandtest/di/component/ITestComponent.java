package com.medithinq.viewmodelcommandtest.di.component;

import com.medithinq.viewmodelcommandtest.di.IActivityScope;
import com.medithinq.viewmodelcommandtest.di.module.TestModule;
import com.medithinq.viewmodelcommandtest.network.TestDown;
import com.medithinq.viewmodelcommandtest.network.TestUp;
import com.medithinq.viewmodelcommandtest.viewmodel.TestViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@IActivityScope
@Component(modules = {
        TestModule.class
})
public interface ITestComponent {
    void inject(TestViewModel viewModel);
    void inject(TestDown test);
    void inject(TestUp test);
}
