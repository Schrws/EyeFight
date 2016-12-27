package sasa.pky.eyefight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by SchrwsK on 2016-12-27.
 */
public class Intro extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.intro);

        Button single = (Button) findViewById(R.id.single);
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intro.this, Main.class);
                startActivity(intent);
            }
        });
    }
}
