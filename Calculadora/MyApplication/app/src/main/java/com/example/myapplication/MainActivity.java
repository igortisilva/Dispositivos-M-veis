package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n1 = (Button) findViewById(R.id.button1);
        n1.setOnClickListener(this);

        Button n2 = (Button) findViewById(R.id.button2);
        n2.setOnClickListener(this);

        Button n3 = (Button) findViewById(R.id.button3);
        n3.setOnClickListener(this);

        Button n4 = (Button) findViewById(R.id.button4);
        n4.setOnClickListener(this);

        Button n5 = (Button) findViewById(R.id.button5);
        n5.setOnClickListener(this);

        Button n6 = (Button) findViewById(R.id.button6);
        n6.setOnClickListener(this);

        Button n7 = (Button) findViewById(R.id.button7);
        n7.setOnClickListener(this);

        Button n8 = (Button) findViewById(R.id.button8);
        n8.setOnClickListener(this);

        Button n9 = (Button) findViewById(R.id.button9);
        n9.setOnClickListener(this);

        Button n11 = (Button) findViewById(R.id.button11);
        n11.setOnClickListener(this);

        Button n12 = (Button) findViewById(R.id.button12);
        n12.setOnClickListener(this);

        Button n13 = (Button) findViewById(R.id.button13);
        n13.setOnClickListener(this);

        Button n14 = (Button) findViewById(R.id.button14);
        n14.setOnClickListener(this);

        Button n15 = (Button) findViewById(R.id.button15);
        n15.setOnClickListener(this);

        Button n16 = (Button) findViewById(R.id.button16);
        n16.setOnClickListener(this);

        Button n0 = (Button) findViewById(R.id.button0);
        n0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                tela("0");
                break;
            case R.id.button1:
                tela("1");
                break;
            case R.id.button2:
                tela("2");
                // do your code
                break;
            case R.id.button3:
                tela("3");
                // do your code
                break;
            case R.id.button4:
                tela("4");
                // do your code
                break;
            case R.id.button5:
                tela("5");
                // do your coe
                break;
            case R.id.button6:
                tela("6");
                // do your code
                break;
            case R.id.button7:
                tela("7");
                // do your code
                break;
            case R.id.button8:
                tela("8");
                // do your code
                break;
            case R.id.button9:
                tela("9");
                // do your code
                break;
            case R.id.button11:
                clear();
                // do your code
                break;
            case R.id.button12:
                resultado();
                // do your code
                break;
            case R.id.button13:
                tela("+");
                // do your code
                break;
            case R.id.button14:
                tela("-");
                // do your code
                break;
            case R.id.button15:
                tela("*");
                // do your code
                break;
            case R.id.button16:
                tela("/");
                // do your code
                break;
            default:
                break;
        }
    }

    private void resultado() {
        TextView monitor = (TextView) findViewById(R.id.textView);
        if (!monitor.getText().toString().equals("")) {

            String[] nums = monitor.getText().toString().split("\\W");
            if (nums.length == 2) {
                double num1 = Double.parseDouble(nums[0]);
                double num2 = Double.parseDouble(nums[1]);
                double res = 0;
                String op = monitor.getText().toString().replaceAll("[^+\\-\\*/]", "");
                if (op.equals("*")) {
                    res = mult(num1, num2);
                } else if (op.equals("-")) {
                    res = subt(num1, num2);
                }
                if (op.equals("/")) {
                    res = divi(num1, num2);
                }
                if (op.equals("+")) {
                    res = somar(num1, num2);
                }
                monitor.setText(String.valueOf(res));
            } else {
                monitor.setText("");
            }
        }
    }

    private void clear() {
        TextView monitor = (TextView) findViewById(R.id.textView);
        monitor.setText("");
    }

    private void tela(String numero) {
        TextView monitor = (TextView) findViewById(R.id.textView);
        String saida = monitor.getText().toString() + numero;
        monitor.setText(saida);
    }

    public double somar(double num, double num2) {

        return (num + num2);
    }

    public double subt(double num, double num2) {
        return (num - num2);
    }

    public double mult(double num, double num2) {
        return (num * num2);
    }

    public double divi(double num, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return (num / num2);

    }
}