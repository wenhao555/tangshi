package com.example.daquan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ZuoZhe extends AppCompatActivity
{
    private TextView shici1, shici2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pome);
        String tag = getIntent().getStringExtra("tag");
        shici1 = findViewById(R.id.shici1);
        shici2 = findViewById(R.id.shici2);
        if (tag.equals("1"))
        {
            shici1.setText("山居秋暝");
            shici2.setText("送元二使安西");
        } else if (tag.equals("2"))
        {
            shici1.setText("无题");
            shici2.setText("夜雨寄北");

        } else if (tag.equals("3"))//
        {
            shici1.setText("清明");
            shici2.setText("山行");
        } else if (tag.equals("4"))
        {
            shici1.setText("示儿");
            shici2.setText("鹧鸪天");
        } else if (tag.equals("5"))
        {
            shici1.setText("归园田居");
            shici2.setText("饮酒");
        }
        shici1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ZuoZhe.this, Shici.class).putExtra("tag", shici1.getText().toString().trim()));
            }
        });
        shici2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ZuoZhe.this, Shici.class).putExtra("tag", shici2.getText().toString().trim()));
            }
        });
    }
}
