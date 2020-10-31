package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"Amazone", "Wisnu", "Mahendra", "Mahasiswa","Amikom", "Yogyakrta", "Informatika", "NIM", "15.11.8550", "Mengerjakan", "Tugas", "Mata", "Kuliah", "Program", "Aplikasi", "Mobile"};

    private ListView lv_data;
    private ArrayAdapter<String> dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);

        lv_data = findViewById(R.id.lv_data);
        lv_data.setAdapter(dataAdapter);

    }
}