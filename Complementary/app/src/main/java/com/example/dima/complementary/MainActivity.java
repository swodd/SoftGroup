package com.example.dima.complementary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    EditText editText;
    Button button;

    int[]array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        array = new int[100];
        for(int i = 1; i < array.length; i++){
            array[i] = i;
        }

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int sum = Integer.parseInt(editText.getText().toString());

                printPairSums(array,sum);

            }
        });
    }

    //Власне сам алгоритм по знаходженню К-компліментарної (K-complementary) пари
    public void printPairSums (int[] array, int sum) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + " " + array[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}

