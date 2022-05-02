package server.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTestUnity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTestUnity=(TextView)findViewById(R.id.idTestUnity);
        mTestUnity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent intent = new Intent(this, UnityPlayerActivity.class);
                intent.putExtra("arguments", "data from android");
                startActivity(intent);*/

            }
        });
    }
}