package com.example.tpappmobiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    /**
     * Se lance a la creation de l'application
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
        bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv = findViewById(R.id.textView);
                tv.setText("Bonjour !");
            }
        });
         */

        tv = findViewById(R.id.textView);
        Log.i("onCreate()","onCreate");
        tv.setText("onCreate()\n\n");
    }

    /**
     * Se lance dès qu'on entre dans l'application
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart()","onstart()");
        tv.append("onStart()\n");

    }

    /**
     * Se lance des que l'application revient au
     * 1er plan
     */
    protected void onResume() {
        super.onResume();
        Log.i("onResume()","onresume()");
        tv.append("onResume()\n\n");

    }

    /**
     * Se lance des que l'application est à
     * l'arrière-plan
     */
    protected void onPause() {
        super.onPause();
        Log.i("onPause()","onpause()");
        tv.append("onPause()\n\n");

    }

    /**
     * Se lance des que l'application relance
     * la fonction start()
     */
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart()","onrestart()");
        tv.append("onRestart()\n\n");
    }

    /**
     * Se lance des que l'application est
     * stoppée
     */
    protected void onStop() {
        super.onStop();
        Log.i("onStop()","onstop()");
    }

    /**
     * Detruit l'application
     */
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy()","ondestroy()");

    }


}