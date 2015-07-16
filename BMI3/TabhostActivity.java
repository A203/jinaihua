package com.jinaihua.bmi3;

import android.os.Bundle;
import android.app.TabActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;


public class TabhostActivity extends TabActivity {

    private EditText height = null;
    private EditText weight = null;
    private Button button = null;
    private TextView show = null;
    private TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);
        host = getTabHost();
        //创建标签页
        TabHost.TabSpec s1 = host.newTabSpec("one");
        //标签名
        s1.setIndicator("关于BMI");
        //内容
        s1.setContent(R.id.aboutBMI);
        //将标签添加到tabHost组件
        host.addTab(s1);

        TabHost.TabSpec s2 = host.newTabSpec("two");
        s2.setIndicator("BMI测试");
        s2.setContent(R.id.testBMI);
        host.addTab(s2);

        Button button = (Button) findViewById(R.id.BMIbutton);

        height = (EditText) findViewById(R.id.height);

        weight = (EditText) findViewById(R.id.weight);

        show = (TextView) findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener()

        {
            double bmi = 0;

            public void onClick(View v) {
                double h = Double.valueOf(height.getText().toString());
                double w = Double.valueOf(weight.getText().toString());
                bmi = w / (h * h);
                double final_result = exchangeResult(bmi);
                if (bmi < 18.5) {
                    show.setText("体重指数：" + final_result + "  " + "偏轻");
                } else if (bmi >= 18.5 && bmi < 24) {
                    show.setText("体重指数：" + final_result + "  " + "健康");
                } else if (bmi >= 24 && bmi < 28) {
                    show.setText("体重指数：" + final_result + "  " + "偏重");
                } else if (bmi >= 28 && bmi < 30) {
                    show.setText("体重指数：" + final_result + "  " + "轻度肥胖");
                } else if (bmi >= 30 && bmi < 35) {
                    show.setText("体重指数：" + final_result + "  " + "中度肥胖");
                } else if (bmi > 35) {
                    show.setText("体重指数：" + final_result + "  " + "重度肥胖");
                }
            }
        });
    }

    public double exchangeResult(double result) {
        double first = result * 100;
        double second = (int) first;
        double second_first;
        second_first = first - second;
        if (second_first > 0.5) {
            second++;
        }
        double jingo = second / 100;
        return jingo;
    }

}







