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
            }
        });

        /**
         * dev2branch 添加第一行
         * 添加第二行
         * 添加第三行
         */

        /**
         * dev3branch 添加第一行
         * dev3branch 添加第二行
         * dev3branch 添加第三行
         */

        // master 主分支 commit1
        // master 主分支 commit2

    }
}
