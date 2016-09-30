package com.example.artem.recycleview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.artem.recycleview.Config;
import com.example.artem.recycleview.R;
import com.example.artem.recycleview.model.Person;

import java.util.ArrayList;

import static com.example.artem.recycleview.ui.MyAdapter.getActivityFromContext;

/**
 * Created by Artem on 20.09.2016.
 */
public class SecondActivity extends AppCompatActivity{
Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView) findViewById(R.id.txt_names_person);
        btn = (Button) findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        String str = "";
        ArrayList<Person> al = Config.getPerson();
        for(int i = 0; i < al.size(); i++)
        {
            str += al.get(i).getmName();
            str += " ";
        }
        tv.setText(str);

    }
}
