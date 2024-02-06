package com.example.lab2;

import java.util.ArrayList;

import android.widget.TextView;

public class EqualHandler implements Handler{

    @Override
    public void handleIt(Object ... parameters) {

        MainActivity activity = (MainActivity) parameters[0];
        //declare TextViews from textViews pass from Calculator
        TextView inputTxt = (TextView) parameters[1];
        TextView solutionTxt = (TextView) parameters[2];

        solutionTxt.setText(inputTxt.getText().toString());
        inputTxt.setText("");
    }
}