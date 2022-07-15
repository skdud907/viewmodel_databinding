package com.medithinq.viewmodelcommandtest.di.component;

import com.medithinq.viewmodelcommandtest.di.module.TestViewModelModule;
import com.medithinq.viewmodelcommandtest.network.TestDown;
import com.medithinq.viewmodelcommandtest.view.MainActivity;
import com.medithinq.viewmodelcommandtest.di.IActivityScope;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@IActivityScope
@Component(modules = {
        TestViewModelModule.class
})
public interface IViewModelComponent {
    void inject(MainActivity view);
}
