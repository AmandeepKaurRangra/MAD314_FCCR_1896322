package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etId, etPassword,data;
    Button btnSubmit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etId = findViewById(R.id.et_id);
        etPassword = findViewById(R.id.et_password);
        data=findViewById(R.id.message);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputId = etId.getText().toString();
                String inputPassword = etPassword.getText().toString();
                String msg=data.getText().toString();
                List<Student> students = StudentDataSource.getInstance().students;


                for (int i = 0; i < students.size(); i++) {
                    Student student = students.get(i);
                    if (student.id == Integer.valueOf(inputId) && student.password.equals(inputPassword)) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("msg", msg);
                        startActivity(intent);

                    }
                    else{
                        Toast invalid = Toast.makeText(
                                getApplicationContext(), "INVALID", Toast.LENGTH_SHORT);
                        invalid.show();
                    }

                }

            }
        });
    }
}
