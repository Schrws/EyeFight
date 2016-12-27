package sasa.pky.eyefight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by SchrwsK on 2016-12-27.
 */
public class Intro extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.intro);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.optionlayout);

        Button single = (Button) findViewById(R.id.single);
        Button random = (Button) findViewById(R.id.random);
        Button option = (Button) findViewById(R.id.option);
        Button x = (Button) findViewById(R.id.x);
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intro.this, Main.class);
                startActivity(intent);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Intro.this, "기능 준비중입니다.", Toast.LENGTH_LONG).show();
            }
        });
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.GONE);
            }
        });
    }
}
