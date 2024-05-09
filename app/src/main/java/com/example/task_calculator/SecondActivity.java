package com.example.task_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.text.DecimalFormat;


public class SecondActivity extends AppCompatActivity {

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '×';
    private static final char DIVISION = '/';
    private static final char MODULO = '%';
    private char currentSymbol;
    private double firstValue = Double.NaN;
    private TextView inputDisplay, outputDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        DecimalFormat decimalFormat = new DecimalFormat("#.##########");

        inputDisplay = findViewById(R.id.input);
        outputDisplay = findViewById(R.id.output);

        MaterialButton btn_0 = findViewById(R.id.btn_0);
        MaterialButton btn_1 = findViewById(R.id.btn_1);
        MaterialButton btn_2 = findViewById(R.id.btn_2);
        MaterialButton btn_3 = findViewById(R.id.btn_3);
        MaterialButton btn_4 = findViewById(R.id.btn_4);
        MaterialButton btn_5 = findViewById(R.id.btn_5);
        MaterialButton btn_6 = findViewById(R.id.btn_6);
        MaterialButton btn_7 = findViewById(R.id.btn_7);
        MaterialButton btn_8 = findViewById(R.id.btn_8);
        MaterialButton btn_9 = findViewById(R.id.btn_9);
        MaterialButton btn_00 = findViewById(R.id.btn_00);

        MaterialButton btn_clear = findViewById(R.id.btn_clear);
        MaterialButton btn_back = findViewById(R.id.btn_back);
        MaterialButton btn_dot = findViewById(R.id.btn_dot);
        MaterialButton btn_equals = findViewById(R.id.btn_equals);

        MaterialButton btn_add = findViewById(R.id.btn_add);
        MaterialButton btn_subtract = findViewById(R.id.btn_subtract);
        MaterialButton btn_multiply = findViewById(R.id.btn_multiply);
        MaterialButton btn_divide = findViewById(R.id.btn_divide);
        MaterialButton btn_modulo = findViewById(R.id.btn_modulo);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "9");
            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + "00");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSymbol = ADDITION;

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue) + "+");
                    inputDisplay.setText(null);
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "+");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSymbol = SUBTRACTION;

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue) + "-");
                    inputDisplay.setText(null);
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "-");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSymbol = MULTIPLICATION;

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue) + "×");
                    inputDisplay.setText(null);
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "×");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }
            }

        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSymbol = DIVISION;

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue) + "/");
                    inputDisplay.setText(null);
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "/");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }

            }
        });
        btn_modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSymbol = MODULO;

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue) + "%");
                    inputDisplay.setText(null);
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "%");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }

            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText(inputDisplay.getText() + ".");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputDisplay.setText("");
                outputDisplay.setText("");
                firstValue = Double.NaN;
                currentSymbol = '0';
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = inputDisplay.getText().toString();
                if (str.isEmpty())
                    return;
                str = str.substring(0, str.length() - 1);
                inputDisplay.setText(str);
            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!inputDisplay.getText().toString().isEmpty()) {
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue));
                } else {
                    try {
                        outputDisplay.setText(decimalFormat.format(firstValue) + "×");
                        firstValue = Double.parseDouble(inputDisplay.getText().toString());
                    } catch (Exception ignored) {

                    }
                    if (!Double.isNaN(firstValue)) {
                        inputDisplay.setText(null);
                    }
                }

//                allCalculations();
//                outputDisplay.setText(decimalFormat.format(firstValue));
//                try {
//                    firstValue = Double.parseDouble(inputDisplay.getText().toString());
//                    outputDisplay.setText(decimalFormat.format(firstValue));
//                } catch (Exception ignored) {
//                }

            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void allCalculations() {
        if (!Double.isNaN(firstValue)) {
            double secondValue = Double.parseDouble(inputDisplay.getText().toString());
            inputDisplay.setText(null);
            if (currentSymbol == ADDITION)
                firstValue = this.firstValue + secondValue;
            else if (currentSymbol == SUBTRACTION)
                firstValue = this.firstValue - secondValue;
            else if (currentSymbol == MULTIPLICATION)
                firstValue = this.firstValue * secondValue;
            else if (currentSymbol == DIVISION)
                firstValue = this.firstValue / secondValue;
            else if (currentSymbol == MODULO)
                firstValue = this.firstValue % secondValue;
        } else {
            try {
                firstValue = Double.parseDouble(inputDisplay.getText().toString());
            } catch (Exception ignored) {
            }
        }
    }
}