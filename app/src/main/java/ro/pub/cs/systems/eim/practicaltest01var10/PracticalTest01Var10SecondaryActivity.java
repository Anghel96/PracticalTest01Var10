package ro.pub.cs.systems.eim.practicaltest01var10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PracticalTest01Var10SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("sum")) {
            String numberOfClicks = intent.getStringExtra("sum");
            String parts[] = numberOfClicks.split(" + ");
            int res = 0;

            for (int i = 0; i < parts.length; ++i) {
                res += Integer.valueOf(parts[i]);
            }



            String result = String.valueOf(res);
            setResult(res);



            /*Intent intent1 = new Intent(getApplicationContext(), PracticalTest01Var10MainActivity.class);

            intent1.putExtra("rez", result);
            startActivity(intent1);
            setResult(RESULT_OK);*/


        }
        finish();

    }
}
