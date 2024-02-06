package com.example.lab2;

import java.util.ArrayList;

import android.widget.TextView;

public class MultiHandler implements Handler {
    private double operand1;
    private double operand2;
    private double result;

    @Override
    public void handleIt(Object... parameters) {
        if (parameters == null || parameters.length < 3) {
            // Handle null or insufficient parameters
            return;
        }

        MainActivity activity = (MainActivity) parameters[0];

        TextView operand1Txt = (TextView) parameters[1];
        TextView operand2Txt = (TextView) parameters[2];

        try {
            operand1 = Double.parseDouble(operand1Txt.getText().toString());
            operand2 = Double.parseDouble(operand2Txt.getText().toString());
        } catch (NumberFormatException e) {
            // Handle parsing errors
            return;
        }

        result = operand1 * operand2;

        // Display the result as a string in operand2Txt
        operand2Txt.setText(String.valueOf(result));

        // Clear operand1Txt for the next input
        operand1Txt.setText("");
    }
}
