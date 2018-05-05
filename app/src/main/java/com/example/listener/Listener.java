package com.example.listener;


import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class Listener implements View.OnClickListener
{
    private Activity act;
    public Listener(Activity act)
    {
        this.act = act;
    }
    @Override
    public void onClick(View v)
    {
        EditText txt = act.findViewById(R.id.txt);
        txt.setText("外部类按钮被单击了！");
    }
}
