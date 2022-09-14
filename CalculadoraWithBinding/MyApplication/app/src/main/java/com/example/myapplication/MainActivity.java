package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button0.setOnClickListener(this);
        binding.button1.setOnClickListener(this);
        binding.button2.setOnClickListener(this);
        binding.button3.setOnClickListener(this);
        binding.button4.setOnClickListener(this);
        binding.button5.setOnClickListener(this);
        binding.button6.setOnClickListener(this);
        binding.button7.setOnClickListener(this);
        binding.button8.setOnClickListener(this);
        binding.button9.setOnClickListener(this);
        binding.button11.setOnClickListener(this);
        binding.button12.setOnClickListener(this);
        binding.button13.setOnClickListener(this);
        binding.button14.setOnClickListener(this);
        binding.button15.setOnClickListener(this);
        binding.button16.setOnClickListener(this);

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
        String monitor = binding.textView.getText().toString();
        if (!monitor.equals("")) {

            String[] nums = monitor.split("\\W");
            if (nums.length == 2) {
                double num1 = Double.parseDouble(nums[0]);
                double num2 = Double.parseDouble(nums[1]);
                double res = 0;
                String op = monitor.replaceAll("[^+\\-\\*/]", "");
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
                binding.textView.setText(String.valueOf(res));
            } else {
                binding.textView.setText("");
            }
        }
    }

    private void clear() {

        binding.textView.setText("");
    }

    private void tela(String numero) {

        String saida = binding.textView.getText().toString() + numero;
        binding.textView.setText(saida);
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