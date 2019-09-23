package com.example.thematrix;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.widget.Toast.LENGTH_SHORT;

public class MatrixActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_1_1) Button btnOne1;
    @BindView(R.id.btn_1_2) Button btnOne2;
    @BindView(R.id.btn_1_3) Button btnOne3;
    @BindView(R.id.btn_1_4) Button btnOne4;
    @BindView(R.id.btn_1_5) Button btnOne5;
    @BindView(R.id.btn_1_6) Button btnOne6;
    @BindView(R.id.btn_1_7) Button btnOne7;
    @BindView(R.id.btn_1_8) Button btnOne8;
    @BindView(R.id.btn_2_1) Button btnTwo1;
    @BindView(R.id.btn_2_2) Button btnTwo2;
    @BindView(R.id.btn_2_3) Button btnTwo3;
    @BindView(R.id.btn_2_4) Button btnTwo4;
    @BindView(R.id.btn_2_5) Button btnTwo5;
    @BindView(R.id.btn_2_6) Button btnTwo6;
    @BindView(R.id.btn_2_7) Button btnTwo7;
    @BindView(R.id.btn_2_8) Button btnTwo8;
    @BindView(R.id.btn_3_1) Button btnThree1;
    @BindView(R.id.btn_3_2) Button btnThree2;
    @BindView(R.id.btn_3_3) Button btnThree3;
    @BindView(R.id.btn_3_4) Button btnThree4;
    @BindView(R.id.btn_3_5) Button btnThree5;
    @BindView(R.id.btn_3_6) Button btnThree6;
    @BindView(R.id.btn_3_7) Button btnThree7;
    @BindView(R.id.btn_3_8) Button btnThree8;
    @BindView(R.id.btn_4_1) Button btnFour1;
    @BindView(R.id.btn_4_2) Button btnFour2;
    @BindView(R.id.btn_4_3) Button btnFour3;
    @BindView(R.id.btn_4_4) Button btnFour4;
    @BindView(R.id.btn_4_5) Button btnFour5;
    @BindView(R.id.btn_4_6) Button btnFour6;
    @BindView(R.id.btn_4_7) Button btnFour7;
    @BindView(R.id.btn_4_8) Button btnFour8;
    @BindView(R.id.btn_5_1) Button btnFive1;
    @BindView(R.id.btn_5_2) Button btnFive2;
    @BindView(R.id.btn_5_3) Button btnFive3;
    @BindView(R.id.btn_5_4) Button btnFive4;
    @BindView(R.id.btn_5_5) Button btnFive5;
    @BindView(R.id.btn_5_6) Button btnFive6;
    @BindView(R.id.btn_5_7) Button btnFive7;
    @BindView(R.id.btn_5_8) Button btnFive8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix_screen);
        ButterKnife.bind(this);
        initButton();
/*        btn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            Toast.makeText(getText(R.id.this.) )
                Toast.makeText(MatrixActivity.this, "hello", LENGTH_SHORT).show();
            }
        });*/
    }

    private void initButton() {
        btnOne1.setOnClickListener(this);
        btnOne2.setOnClickListener(this);
        btnOne3.setOnClickListener(this);
        btnOne4.setOnClickListener(this);
        btnOne5.setOnClickListener(this);
        btnOne6.setOnClickListener(this);
        btnOne7.setOnClickListener(this);
        btnOne8.setOnClickListener(this);

        btnTwo1.setOnClickListener(this);
        btnTwo2.setOnClickListener(this);
        btnTwo3.setOnClickListener(this);
        btnTwo4.setOnClickListener(this);
        btnTwo5.setOnClickListener(this);
        btnTwo6.setOnClickListener(this);
        btnTwo7.setOnClickListener(this);
        btnTwo8.setOnClickListener(this);

        btnThree1.setOnClickListener(this);
        btnThree2.setOnClickListener(this);
        btnThree3.setOnClickListener(this);
        btnThree4.setOnClickListener(this);
        btnThree5.setOnClickListener(this);
        btnThree6.setOnClickListener(this);
        btnThree7.setOnClickListener(this);
        btnThree8.setOnClickListener(this);

        btnFour1.setOnClickListener(this);
        btnFour2.setOnClickListener(this);
        btnFour3.setOnClickListener(this);
        btnFour4.setOnClickListener(this);
        btnFour5.setOnClickListener(this);
        btnFour6.setOnClickListener(this);
        btnFour7.setOnClickListener(this);
        btnFour8.setOnClickListener(this);

        btnFive1.setOnClickListener(this);
        btnFive2.setOnClickListener(this);
        btnFive3.setOnClickListener(this);
        btnFive4.setOnClickListener(this);
        btnFive5.setOnClickListener(this);
        btnFive6.setOnClickListener(this);
        btnFive7.setOnClickListener(this);
        btnFive8.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Toast.makeText(this, view.getTag().toString(), LENGTH_SHORT).show();


    }

}
