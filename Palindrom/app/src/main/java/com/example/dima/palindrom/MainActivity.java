package com.example.dima.palindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s = editText.getText().toString();
                String sb = new StringBuilder(s).reverse().toString();
                if( s.equals(sb)){
                    Toast.makeText(getApplicationContext(), "Yes, it's palindrom", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Not palindrom", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
    public String check(String s, String sb){

        if( s.equals(sb)){
            return s;
        }else{
            return sb;
        }

    }
}
