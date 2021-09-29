package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtNum1, txtNum2, txtOperation, txtResult;
    private Button btnClear, btnDel, btnPercent, btnDivide, btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnMultiply, btnSum, btnSub, btnEqual, btnDecimal, btnClose;
    private float valueNum1, valueNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        listener();

    }

    private void listener() {
        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "0");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "0");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }

            }
        });
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "1");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "1");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }

            }
        });
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "2");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "2");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "3");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "3");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "4");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "4");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "5");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "5");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "6");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "6");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "7");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "7");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "8");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "8");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "") {
                    txtNum1.setText(txtNum1.getText() + "9");
                    valueNum1 = Float.parseFloat(txtNum1.getText() + "");
                } else {
                    txtNum2.setText(txtNum2.getText() + "9");
                    valueNum2 = Float.parseFloat(txtNum2.getText() + "");
                }
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1.setText(txtNum1.getText() + ".");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtOperation.setText("");
                txtResult.setText("");
                valueNum1 = 0;
                valueNum2 = 0;
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(valueNum1 * 0.01 + "");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOperation.setText("/");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOperation.setText("*");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOperation.setText("-");
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOperation.setText("+");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtOperation.getText() == "+") {
                    float fResult = valueNum1 + valueNum2;
                    txtResult.setText(fResult + "");
                    if (fResult >= 0) {
                        txtResult.setTextColor(Color.parseColor("#0CDC15"));
                    } else {
                        txtResult.setTextColor(Color.parseColor("#E80909"));
                    }
                } else if (txtOperation.getText() == "*") {
                    float fResult = valueNum1 * valueNum2;
                    txtResult.setText(fResult + "");
                    if (fResult >= 0) {
                        txtResult.setTextColor(Color.parseColor("#0CDC15"));
                    } else {
                        txtResult.setTextColor(Color.parseColor("#E80909"));
                    }
                } else if (txtOperation.getText() == "/") {
                    float fResult = valueNum1 / valueNum2;
                    txtResult.setText(fResult + "");
                    if (fResult >= 0) {
                        txtResult.setTextColor(Color.parseColor("#0CDC15"));
                    } else {
                        txtResult.setTextColor(Color.parseColor("#E80909"));
                    }
                } else if (txtOperation.getText() == "-") {
                    float fResult = valueNum1 - valueNum2;
                    txtResult.setText(fResult + "");
                    if (fResult >= 0) {
                        txtResult.setTextColor(Color.parseColor("#0CDC15"));
                    } else {
                        txtResult.setTextColor(Color.parseColor("#E80909"));
                    }
                }
            }
        });


    }

    private void findView() {
        txtNum1 = findViewById(R.id.txt_num_1);
        txtNum2 = findViewById(R.id.txt_num_2);
        txtOperation = findViewById(R.id.txt_operation);
        txtResult = findViewById(R.id.txt_result);
        btnClear = findViewById(R.id.btn_clear);
        btnDel = findViewById(R.id.btn_del);
        btnPercent = findViewById(R.id.btn_percent);
        btnDivide = findViewById(R.id.btn_divide);
        btnNum0 = findViewById(R.id.btn_num_0);
        btnNum1 = findViewById(R.id.btn_num_1);
        btnNum2 = findViewById(R.id.btn_num_2);
        btnNum3 = findViewById(R.id.btn_num_3);
        btnNum4 = findViewById(R.id.btn_num_4);
        btnNum5 = findViewById(R.id.btn_num_5);
        btnNum6 = findViewById(R.id.btn_num_6);
        btnNum7 = findViewById(R.id.btn_num_7);
        btnNum8 = findViewById(R.id.btn_num_8);
        btnNum9 = findViewById(R.id.btn_num_9);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnSum = findViewById(R.id.btn_sum);
        btnSub = findViewById(R.id.btn_sub);
        btnEqual = findViewById(R.id.btn_equal);
        btnDecimal = findViewById(R.id.btn_decimal_sign);
        btnClose = findViewById(R.id.btn_close);

    }
}