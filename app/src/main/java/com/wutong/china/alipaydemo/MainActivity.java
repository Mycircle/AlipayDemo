package com.wutong.china.alipaydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    protected Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    //我第一次修改；
    //第二次修改；
    private void initView() {
        toolBar = (Toolbar) findViewById(R.id.tool_bar);
    }
}
