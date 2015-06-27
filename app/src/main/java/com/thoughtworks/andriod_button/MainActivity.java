package com.thoughtworks.andriod_button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btn1 = null;

    /*
      这里实现了一个注册事件，当点击某个按钮的时候触发一个事件
      然后这里使用了Toast来输出log信息
      第一个参数是那个activity
      第二个参数是需要输出的信息
      第三个参数是什么时间显示
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了按钮",Toast.LENGTH_LONG).show();
            }
        });
    }

}
