package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.richcgim.mp1_mad314_pa2.R;

public class Main2Activity extends AppCompatActivity {
    EditText nid;
    RecyclerView rvStudents;
    Button back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nid=findViewById(R.id.textView);
        back=findViewById(R.id.button);
        Intent intent=getIntent();



        String show=intent.getStringExtra("msg");
        nid.setText("Your message="+show);

        rvStudents = findViewById(R.id.rvStudents);
        rvStudents.setLayoutManager(new LinearLayoutManager(this));

        StudentAdapter studentAdapter = new StudentAdapter(getApplicationContext());
        rvStudents.setAdapter(studentAdapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}

