package com.example.listener;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{
        EditText show;
        @Override
        public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn1 = (Button) findViewById(R.id.button1);
        bn1.setOnClickListener(new Click1());
        Button bn2 = (Button) findViewById(R.id.button2);
        bn2.setOnClickListener(new Listener(this));
        Button bn3 = (Button) findViewById(R.id.button3);
        show = (EditText) findViewById(R.id.txt);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("匿名内部类按钮被单击了！");
            }
        });
        Button bn4 = (Button) findViewById(R.id.button4);
        bn4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        show.setText("Activity按钮被单击了！");
    }
    public static class firstfragment extends Fragment{
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.firstfragment, container, false);
            return view;
        }
    }
    public static class secondfragment extends Fragment{
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.secondfragment, container, false);
            return view;
        }
    }
    class Click1 implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            EditText txt = (EditText) findViewById(R.id.txt);
            txt.setText("内部类按钮被单击了！");
        }
    }
    public void clickHandler(View source)
    {
        show = (EditText) findViewById(R.id.txt);
        show.setText("绑定到标签按钮被单击了！");
    }
}
