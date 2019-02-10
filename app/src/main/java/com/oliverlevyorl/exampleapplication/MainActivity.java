package com.oliverlevyorl.exampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mFalse_button;
    private Button mTrue_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrue_button = (Button) findViewById(R.id.true_button);
        mTrue_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mFalse_button = (Button) findViewById(R.id.false_button);
        mFalse_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    Toast.makeText(MainActivity.this,R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
