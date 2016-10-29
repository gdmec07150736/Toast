package com.example.administrator.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"test1",Toast.LENGTH_LONG).show();
    }
    public void b2(View v){
        LayoutInflater lf=getLayoutInflater();
        View view=lf.inflate(R.layout.toastroot,null);
        LinearLayout ll=(LinearLayout) view.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastinfo,ll);
        Toast t=new Toast(this);
        t.setView(view);
        t.show();
    }
    public void b3(View v){
        Toast t=Toast.makeText(this,"I am yellowman",Toast.LENGTH_LONG);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView imagev=new ImageView(this);
        imagev.setImageResource(R.drawable.yellowman);
        View tview=t.getView();
        ll.addView(imagev);
        ll.addView(tview);
        t.setView(ll);
        t.show();
    }
}
