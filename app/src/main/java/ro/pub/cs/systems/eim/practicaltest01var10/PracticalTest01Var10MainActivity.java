package ro.pub.cs.systems.eim.practicaltest01var10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var10MainActivity extends AppCompatActivity {

    EditText computeResultText;
    EditText addNumberText;
    Button computeButton;
    Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var10_main);

        addNumberText = (EditText)findViewById(R.id.editText1);
        computeResultText = (EditText)findViewById(R.id.editText2);
        computeButton = (Button) findViewById(R.id.addButton);
        addButton = (Button) findViewById(R.id.cButton);
    }
}
