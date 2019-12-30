package com.example.daquan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Shiren extends AppCompatActivity implements View.OnClickListener
{
    private TextView wangwei, lisahngyin, dumu, luyou, taoyuanmign;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
        wangwei = findViewById(R.id.wangwei);
        lisahngyin = findViewById(R.id.lisahngyin);
        dumu = findViewById(R.id.dumu);
        luyou = findViewById(R.id.luyou);
        taoyuanmign = findViewById(R.id.taoyuanmign);

        wangwei.setOnClickListener(this);
        lisahngyin.setOnClickListener(this);
        dumu.setOnClickListener(this);
        luyou.setOnClickListener(this);
        taoyuanmign.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.wangwei:
                startActivity(new Intent(this, ZuoZhe.class).putExtra("tag", "1"));
                break;
            case R.id.lisahngyin:
                startActivity(new Intent(this, ZuoZhe.class).putExtra("tag", "2"));
                break;
            case R.id.dumu:
                startActivity(new Intent(this, ZuoZhe.class).putExtra("tag", "3"));
                break;
            case R.id.luyou:
                startActivity(new Intent(this, ZuoZhe.class).putExtra("tag", "4"));
                break;
            case R.id.taoyuanmign:
                startActivity(new Intent(this, ZuoZhe.class).putExtra("tag", "5"));
                break;
        }
    }
}
