package com.medithinq.viewmodelcommandtest.viewmodel;

import androidx.databinding.ObservableField;

import com.medithinq.viewmodelcommandtest.ActivityApplication;
import com.medithinq.viewmodelcommandtest.network.ITestListener;

import javax.inject.Inject;

public class TestViewModel {
    @Inject
    ITestListener m_iTestListener;

    private ObservableField<String> word1 = new ObservableField<>();

    public TestViewModel() {
        ActivityApplication.getActivityApplication().getITestComponent().inject(TestViewModel.this);
    }

    public void onPlay() {
        word1.set(m_iTestListener.Test());
    }

    public ObservableField<String> getWord() {
        return word1;
    }
}
