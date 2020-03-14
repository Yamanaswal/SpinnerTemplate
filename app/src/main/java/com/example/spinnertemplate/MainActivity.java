package com.example.spinnertemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner text_spinner, id_spinner_user;
    Button set_user_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Text Spinner
         */
        text_spinner = findViewById(R.id.text_spinner);
        //set data to spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        //type of spinner
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        text_spinner.setAdapter(adapter);
        text_spinner.setOnItemSelectedListener(this);

        /*
        Populate with Model Class
         */
        id_spinner_user = findViewById(R.id.id_spinner_user);
        List<User> list = new ArrayList<>();

        list.add(new User("Yaman",20,"yamanaswal@gmail.com"));
        list.add(new User("Mainsh",30,"mainsh@gmail.com"));
        list.add(new User("Yaman",20,"yamanaswal@gmail.com"));

        ArrayAdapter<User> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,list);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        id_spinner_user.setAdapter(adapter1);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "Number data:" + text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
