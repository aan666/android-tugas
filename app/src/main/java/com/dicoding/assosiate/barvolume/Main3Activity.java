package com.dicoding.assosiate.barvolume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveActivity;
    private Button btnMoveWithDataActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnMoveWithDataActivity = (Button)findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(Main3Activity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(Main3Activity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
