package com.dicoding.assosiate.barvolume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//untuk pindah ke activitynya(yg bawah)
        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
    }
// ketika button di klik
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(Main2Activity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
