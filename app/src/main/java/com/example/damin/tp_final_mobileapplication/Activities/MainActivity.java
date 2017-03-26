package com.example.damin.tp_final_mobileapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.damin.tp_final_mobileapplication.R;

public class MainActivity extends AppCompatActivity  {

    private String recherche ="";
    private String KEY = "RechercheYoutube";
    private EditText Text;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Toolbar mytoolbar = (Toolbar)findViewById(R.id.Toolbar);
        setSupportActionBar(mytoolbar);

        getSupportActionBar().setTitle("MyYoutube");
        getSupportActionBar().setIcon(getDrawable(R.drawable.icon_fire));

        button = (Button)findViewById(R.id.buttonRecherche);
        Text=(EditText) findViewById(R.id.editText);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,SecondeActivity.class);
                     recherche=Text.getText().toString();
                    intent.putExtra(KEY,recherche);

                        startActivity(intent);

                }
            });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();

        menuInflater.inflate(R.menu.menu_toolbar,menu);

        return super.onCreateOptionsMenu(menu);
    }


    public String getKEY() {
        return KEY;
    }
}
