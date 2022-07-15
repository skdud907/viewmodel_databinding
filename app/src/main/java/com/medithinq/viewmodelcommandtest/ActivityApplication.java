package com.medithinq.viewmodelcommandtest;

import android.app.Application;
import android.content.Context;

import com.medithinq.viewmodelcommandtest.di.component.DaggerITestComponent;
import com.medithinq.viewmodelcommandtest.di.component.DaggerIViewModelComponent;
import com.medithinq.viewmodelcommandtest.di.component.ITestComponent;
import com.medithinq.viewmodelcommandtest.di.component.IViewModelComponent;
import com.medithinq.viewmodelcommandtest.di.module.TestModule;
import com.medithinq.viewmodelcommandtest.di.module.TestViewModelModule;

public class ActivityApplication extends Application {
    private ITestComponent m_iTestComponent;
    private IViewModelComponent m_iViewModelComponent;

    private static ActivityApplication m_activityApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        m_activityApplication = this;

        m_iTestComponent = DaggerITestComponent.builder()
                .testModule(new TestModule())
                .build();

        m_iViewModelComponent = DaggerIViewModelComponent.builder()
                .testViewModelModule(new TestViewModelModule())
                .build();
    }

    public Context getAppContext() {
        return getApplicationContext();
    }

    public static ActivityApplication getActivityApplication() {
        return m_activityApplication;
    }

    public IViewModelComponent getIViewModelComponent() {
        return m_iViewModelComponent;
    }

    public ITestComponent getITestComponent() {
        return m_iTestComponent;
    }
}
