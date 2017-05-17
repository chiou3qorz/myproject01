package com.ehappy.exradiobutton01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private RadioButton radBasketBall,radFootBall,radBaseBall;
    private RadioGroup radGroupBalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 取得介面元件 id
        txtResult=(TextView) findViewById(R.id.txtResult);
        radGroupBalls=(RadioGroup) findViewById(R.id.radGroupBalls);
        radBasketBall = (RadioButton) findViewById(R.id.radBasketBall);
        radFootBall= (RadioButton) findViewById(R.id.radFootBall);
        radBaseBall = (RadioButton) findViewById(R.id.radBaseBall);

        // 設定 radGroupBalls 元件 CheckedChange 事件的 listener 為 radGroupBallsListener
        radGroupBalls.setOnCheckedChangeListener(radGroupBallsListener);
    }

    //  定義 onCheckedChanged 方法
    private RadioGroup.OnCheckedChangeListener radGroupBallsListener=
        new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int  p = group.indexOfChild((RadioButton) findViewById(checkedId));	// 選項的索引值
                int count = group.getChildCount(); // 清單總共有多少項

                if (checkedId == R.id.radBasketBall)
                    txtResult.setText( count + " 項球類中，最喜歡第 " + (p+1) + " 項 " + radBasketBall.getText());
                else if (checkedId == R.id.radFootBall)
                    txtResult.setText( count + " 項球類中，最喜歡第 " + (p+1) + " 項 " + radFootBall.getText());
                else if (checkedId == R.id.radBaseBall)
                    txtResult.setText( count + " 項球類中，最喜歡第 " + (p+1) + " 項 " + radBaseBall.getText());
            }
        };
}