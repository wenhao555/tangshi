package com.example.daquan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Denglu extends Activity implements OnClickListener
{
    private EditText name, pwd;
    private Button login, regist;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText) findViewById(R.id.name);
        pwd = (EditText) findViewById(R.id.pwd);
        regist = (Button) findViewById(R.id.regist);
        login = (Button) findViewById(R.id.login);
        regist.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0)
    {
        // TODO Auto-generated method stub
        switch (arg0.getId())
        {
            case R.id.regist:
                startActivity(new Intent(this, zhuce.class));
                break;
            case R.id.login:
                String aString = name.getText().toString();
                String bString = pwd.getText().toString();
                if (!aString.equals("") && !bString.equals(""))
                {
                    if (aString.equals(PrefUtils.getString(this, "name", ""))
                            && bString.equals(PrefUtils.getString(this, "pwd", "")))
                    {
                        startActivity(new Intent(this, Shiren.class));
                        finish();
                    } else
                    {
                        Toast.makeText(this, "账号密码错误", Toast.LENGTH_LONG).show();
                    }

                } else
                {
                    Toast.makeText(this, "请输入密码或账号", Toast.LENGTH_LONG).show();

                }

                break;
        }
    }
}
