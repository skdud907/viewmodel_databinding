package com.medithinq.viewmodelcommandtest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.medithinq.viewmodelcommandtest.ActivityApplication;
import com.medithinq.viewmodelcommandtest.R;
import com.medithinq.viewmodelcommandtest.databinding.ActivityMainBinding;
import com.medithinq.viewmodelcommandtest.viewmodel.TestViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    TestViewModel m_testViewModel;

    private ActivityMainBinding m_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityApplication.getActivityApplication().getIViewModelComponent().inject(MainActivity.this);

        m_binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        m_binding.setTestViewModel(m_testViewModel);
        m_binding.setLifecycleOwner(this);
    }
}