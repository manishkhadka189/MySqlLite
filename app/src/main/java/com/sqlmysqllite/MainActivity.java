package com.sqlmysqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sqlmysqllite.helper.MyHelper;

public class MainActivity extends AppCompatActivity {
 private EditText word, meaning;
 private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        word=findViewById(R.id.word);
        meaning=findViewById(R.id.meaning);
        btnAdd=findViewById(R.id.add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MyHelper myHelper = new MyHelper(MainActivity.this);
                SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();
            }
        });

    }
}
