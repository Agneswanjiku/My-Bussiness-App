package com.moringaschool.mybussinessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(value = R.id.findRegisterButton) Button mFindRegisterButton;
    @BindView(R.id.goodsEditText)
    EditText mGoodsEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String goods = mGoodsEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Activity.class);
                intent.putExtra("goods",goods);
                startActivity(intent);
            }
        });
    }
}