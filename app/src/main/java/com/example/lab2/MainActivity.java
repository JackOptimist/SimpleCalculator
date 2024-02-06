package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnDecimal;
    private Button btnEquals;

    private Button btnClear;
    private Button btnBack;

    private TextView txtInput;
    private TextView txtSolution;
    private int totalClickCount;

    private MainActivity activity;
    protected String command;
    protected String operand;
    protected String numKey;
    protected String btnNumber;
    protected int counter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        this.txtInput = (TextView) this.findViewById(R.id.txtInput);
        this.txtSolution = (TextView) this.findViewById(R.id.txtSolution);

        command = "=";
        operand = "";
        numKey = "numKey";

        this.btnZero = (Button) this.findViewById(R.id.btnZero);
        this.btnZero.setOnClickListener(arg0 -> {
            btnNumber = btnZero.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);

        });

        this.btnOne = (Button) this.findViewById(R.id.btnOne);
        this.btnOne.setOnClickListener(arg0 -> {

            btnNumber = btnOne.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnTwo = (Button) this.findViewById(R.id.btnTwo);
        this.btnTwo.setOnClickListener(arg0 -> {
            btnNumber = btnTwo.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnThree = (Button) this.findViewById(R.id.btnThree);
        this.btnThree.setOnClickListener(arg0 -> {
            btnNumber = btnThree.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnFour = (Button) this.findViewById(R.id.btnFour);
        this.btnFour.setOnClickListener(arg0 -> {
            btnNumber = btnFour.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnFive = (Button) this.findViewById(R.id.btnFive);
        this.btnFive.setOnClickListener(arg0 -> {
            btnNumber = btnFive.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnSix = (Button) this.findViewById(R.id.btnSix);
        this.btnSix.setOnClickListener(arg0 -> {
            btnNumber = btnSix.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnSeven = (Button) this.findViewById(R.id.btnSeven);
        this.btnSeven.setOnClickListener(arg0 -> {
            btnNumber = btnSeven.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnEight = (Button) this.findViewById(R.id.btnEight);
        this.btnEight.setOnClickListener(arg0 -> {
            btnNumber = btnEight.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnNine = (Button) this.findViewById(R.id.btnNine);
        this.btnNine.setOnClickListener(arg0 -> {
            btnNumber = btnNine.getText().toString();
            ApplicationController.handleRequest(numKey, btnNumber, txtInput);
        });

        this.btnDecimal = (Button) this.findViewById(R.id.btnDecimal);
        this.btnDecimal.setOnClickListener(arg0 -> {

            String InputText = txtInput.getText().toString();
            counter = InputText.indexOf(".");

            if(counter == -1){

                btnNumber = btnDecimal.getText().toString();
                ApplicationController.handleRequest(numKey, btnNumber, txtInput);
            }

        });

        this.btnSubtract = (Button) this.findViewById(R.id.btnSubtract);
        this.btnSubtract.setOnClickListener(arg0 -> {
            operand = btnSubtract.getText().toString();
            ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
            command = operand;
        });

        this.btnMultiply = (Button) this.findViewById(R.id.btnMultiply);
        this.btnMultiply.setOnClickListener(arg0 -> {
            operand = btnMultiply.getText().toString();
            ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
            command = operand;
        });

        this.btnDivide = (Button) this.findViewById(R.id.btnDivide);
        this.btnDivide.setOnClickListener(arg0 -> {
            operand = btnDivide.getText().toString();
            ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
            command = operand;
        });

        this.btnAdd = (Button) this.findViewById(R.id.btnAdd);
        this.btnAdd.setOnClickListener(arg0 -> {
            operand = btnAdd.getText().toString();
            ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
            command = operand;
        });

        this.btnEquals = (Button) this.findViewById(R.id.btnEquals);
        this.btnEquals.setOnClickListener(arg0 -> {
            operand = btnEquals.getText().toString();
            ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
            command = operand;
        });


        this.btnClear = (Button) this.findViewById(R.id.btnClear);
        this.btnClear.setOnClickListener(arg0 -> {
            txtInput.setText("");
            txtSolution.setText("");
            command = "=";
            operand = "=";
        });


        this.btnBack = (Button) this.findViewById(R.id.btnBack);
        this.btnBack.setOnClickListener(arg0 -> {
            try {
                String back = txtInput.getText().toString();
                int length = back.length() - 1;
                String back2 = back.substring(0, length);
                txtInput.setText(back2);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });

        totalClickCount = 0;

        this.btnZero.setOnClickListener(arg0 -> {
            if (totalClickCount < 8) {
                btnNumber = btnZero.getText().toString();
                ApplicationController.handleRequest(numKey, btnNumber, txtInput);
                totalClickCount++;
            }

            if (totalClickCount == 8)
                Toast.makeText(this, "You clicked more than 8", Toast.LENGTH_SHORT).show();
        });

        this.btnClear.setOnClickListener(arg0 -> {
            txtInput.setText("");
            txtSolution.setText("");
            command = "=";
            operand = "=";
            totalClickCount = 0;
        });
    }
}
