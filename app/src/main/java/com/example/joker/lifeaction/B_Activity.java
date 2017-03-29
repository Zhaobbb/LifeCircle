package com.example.joker.lifeaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by joker on 2017/3/29.
 */

public class B_Activity extends Activity {
    private Button button2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);

        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(B_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("zzz","this is B_Acitvity's onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("zzz","this is B_Acitvity's onReStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("zzz","this is B_Acitvity's onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("zzz","this is B_Acitvity's onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("zzz","this is B_Acitvity's onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("zzz","this is B_Acitvity's onDestory()");
    }
}
