package com.ehappy.exintent03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 取得介面元件
        Button btnPage2=(Button)findViewById(R.id.btnPage2);
        // 設定 button 的 Listener
        btnPage2.setOnClickListener(btnPage2Listner);
    }

    private Button.OnClickListener btnPage2Listner=new Button.OnClickListener(){
        public void onClick(View v){
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,Second.class);

            String name="David";
            int age=27;
            Double tall=183.5;

            Bundle bundle=new Bundle();
            bundle.putString("NAME", name);
            bundle.putInt("AGE", age);
            bundle.putDouble("TALL", tall);
            intent.putExtras(bundle);

            // 執行附帶資料的 Intent
            startActivity(intent);
        }
    };
}