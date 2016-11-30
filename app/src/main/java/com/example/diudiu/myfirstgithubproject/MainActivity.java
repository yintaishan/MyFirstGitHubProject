package com.example.diudiu.myfirstgithubproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    private Button button2;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = (Button) findViewById(R.id.button);
        this.button2 = (Button) findViewById(R.id.button2);
        this.textView = (TextView) findViewById(R.id.textView);

        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("button clicked!!!");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("button2 clicked!!!");
            }
        });
/**
 * dev9branch
 */

        /**
         * master 添加内容的
         * master 修改内容
         * 我两地分居辽阔的房间按劳动法啊啊大连看
         */

    }
}
