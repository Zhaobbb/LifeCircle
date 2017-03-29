package com.example.joker.lifeaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,B_Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("zzz","this is MainAcitvity's onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("zzz","this is MainAcitvity's onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("zzz","this is MainAcitvity's onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("zzz","this is MainAcitvity's onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("zzz","this is MainAcitvity's onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("zzz","this is MainAcitvity's onDestory()");
    }
}
