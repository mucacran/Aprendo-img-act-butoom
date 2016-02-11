package com.gpg.aprendiendo1.pn;



import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgBot = (ImageButton) findViewById(R.id.imageButton);

        final Context context = this;
        imgBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
