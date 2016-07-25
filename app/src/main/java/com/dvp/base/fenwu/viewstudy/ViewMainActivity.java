package com.dvp.base.fenwu.viewstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewMainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_main);

        View view = new View(this);

    }
}
