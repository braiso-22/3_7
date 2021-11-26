package com.example.a3_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Type;


public class MainActivity extends AppCompatActivity {

    ListView lView;
    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lView = (ListView) findViewById(R.id.androidList);
        String[] letras = getResources().getStringArray(R.array.letras);
        String[] numeros = getResources().getStringArray(R.array.numeros);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.imagenes);
        lAdapter = new ListAdapter(this, letras, numeros, imagenes);
        lView.setAdapter(lAdapter);
        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, letras[i] + "" + numeros[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
