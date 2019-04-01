package ro.pub.cs.systems.eim.practicaltest01var10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var10MainActivity extends AppCompatActivity {

    EditText computeResultText;
    EditText addNumberText;
    Button computeButton;
    Button addButton;


    private ButtonListener bt = new ButtonListener();

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {

                case R.id.addButton:

                    String conc = addNumberText.getText().toString();

                    if (conc != null) {
                        String res = computeResultText.getText().toString();
                        if (res.length() == 0) {
                            computeResultText.setText(conc);
                        } else {
                            computeResultText.setText(res + " + " + conc);
                        }

                    }


                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var10SecondaryActivity.class);
                    String send = computeResultText.getText().toString();
                    intent.putExtra("sum", send);
                    startActivityForResult(intent, 1);
                    break;
                case R.id.cButton:
                    Intent intent1 = new Intent(getApplicationContext(), PracticalTest01Var10SecondaryActivity.class);
                    String send2 = computeResultText.getText().toString();
                    intent1.putExtra("sum", send2);
                    startActivityForResult(intent1, 1);
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var10_main);

        addNumberText = (EditText)findViewById(R.id.editText1);
        computeResultText = (EditText)findViewById(R.id.editText2);
        computeButton = (Button) findViewById(R.id.addButton);
        addButton = (Button) findViewById(R.id.cButton);

        computeButton.setOnClickListener(bt);
        addButton.setOnClickListener(bt);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 1) {
            //if (intent != null && intent.getExtras().containsKey("rez")) {
                //String a = intent.getStringExtra("rez");
                Toast.makeText(this, "The activity returned with result " + String.valueOf(resultCode), Toast.LENGTH_LONG).show();
            //}


        }
    }
}
