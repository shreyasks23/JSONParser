package com.example.application.jsonparser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class JSONParseActivity extends AppCompatActivity {

    private Button button_getJSONObject;
    private Button button_getJSONArray;
    private final String EXTRA_JSON_OBJECT_INDEX = "com.example.application.jsonparser";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsonparse);
        button_getJSONObject = (Button) findViewById(R.id.button_jsonobject);
        button_getJSONArray = (Button) findViewById(R.id.button_jsonarray);

        button_getJSONObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),ParseJSONObject.class);
                i.putExtra(EXTRA_JSON_OBJECT_INDEX, 0);
                startActivity(i);
            }
        });

        button_getJSONArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),ParseJSONArray.class);
                startActivity(i);
            }
        });

    }
}
