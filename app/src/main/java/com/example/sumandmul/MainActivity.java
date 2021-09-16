package com.example.sumandmul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewResult;
    EditText inputText;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
        inputText = (EditText) findViewById(R.id.inputText);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void checkButton(View view){
        //is the button now checked?
        boolean checked = ((RadioButton)view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()){
            case R.id.radioButtonSum:
                if(checked)
                   selected = "SUM";
                    break;
            case R.id.radioButtonMul:
                if(checked)
                    selected = "MUL";
                    break;
        }
    }

    public void perform(View view){
        String data = inputText.getText().toString();
        int n =Integer.parseInt(data);

        if(selected == "SUM"){
            int s=0;
            for(int i=1;i<=n;i++){
                s=s+i;
            }
            textViewResult.setText("Result "+ s);
        }else if(selected=="MUL"){
            int m=1;
            for(int i=1;i<=n;i++){
                m=m*i;
            }
            textViewResult.setText("Result "+ m);
        }

    }

}