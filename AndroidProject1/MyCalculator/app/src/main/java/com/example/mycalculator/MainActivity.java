package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int value1;
    int value2;
    int result;

    int numberofinput;
    int num_operand;
    String operand;

    EditText myEdittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEdittext = (EditText) findViewById(R.id.number);
        numberofinput = 0;
        num_operand = 0;

    }

    public void onClick1(View view) {

        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 1;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 1;
                myEdittext.setText(String.valueOf(value1));
            }
        }
        else{
            if(numberofinput==0){
                value2 = 1;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 1;
                myEdittext.setText(String.valueOf(value2));
            }
        }

    }

    public void onClick2(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 2;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 2;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 2;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 2;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick3(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 3;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 3;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 3;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 3;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick4(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 4;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 4;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 4;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 4;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick5(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 5;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 5;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 5;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 5;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick6(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 6;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 6;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 6;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 6;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick7(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 7;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 7;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 7;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 7;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick8(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 8;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 8;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 8;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 8;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick9(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 9;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 9;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 9;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 9;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick0(View view) {
        if(num_operand == 0){
            if(numberofinput==0){
                value1 = 0;
                myEdittext.setText(String.valueOf(value1));
                numberofinput++;
            }
            else{
                value1 = value1 * 10 + 0;
                myEdittext.setText(String.valueOf(value1));
            }

        }
        else{
            if(numberofinput==0){
                value2 = 0;
                myEdittext.setText(String.valueOf(value2));
                numberofinput++;
            }
            else{
                value2 = value2 * 10 + 0;
                myEdittext.setText(String.valueOf(value2));
            }
        }
    }

    public void onClick_plus(View view) {
        if(num_operand>0){
            if (operand == "+"){
                value1 = value1 + value2;
            }
            else if(operand == "-"){
                value1 = value1 - value2;
            }
            else if(operand == "*"){
                value1 = value1 * value2;
            }
            else{
                value1 = value1 / value2;
            }
        }
        operand = "+";
        numberofinput = 0;
        num_operand++;


    }

    public void onClick_minus(View view) {
        if(num_operand>0){
            if (operand == "+"){
                value1 = value1 + value2;
            }
            else if(operand == "-"){
                value1 = value1 - value2;
            }
            else if(operand == "*"){
                value1 = value1 * value2;
            }
            else{
                value1 = value1 / value2;
            }
        }
        operand = "-";
        numberofinput = 0;
        num_operand++;

    }

    public void onClick_mul(View view) {
        if(num_operand>0){
            if (operand == "+"){
                value1 = value1 + value2;
            }
            else if(operand == "-"){
                value1 = value1 - value2;
            }
            else if(operand == "*"){
                value1 = value1 * value2;
            }
            else{
                value1 = value1 / value2;
            }
        }
        operand = "*";
        numberofinput = 0;
        num_operand++;
    }

    public void onClick_div(View view) {
        if(num_operand>0){
            if (operand == "+"){
                value1 = value1 + value2;
            }
            else if(operand == "-"){
                value1 = value1 - value2;
            }
            else if(operand == "*"){
                value1 = value1 * value2;
            }
            else{
                value1 = value1 / value2;
            }
        }
        operand = "/";
        numberofinput = 0;
        num_operand++;
    }

    public void onClick_clear(View view) {
        value1 = 0;
        value2 = 0;
        result = 0;
        numberofinput = 0;
        num_operand = 0;
        myEdittext.setText("");

    }

    public void onClick_ok(View view) {
        if(operand == "+"){
            result = value1 + value2;
        }
        else if(operand == "-"){
            result = value1 - value2;
        }
        else if(operand == "*"){
            result = value1 * value2;
        }
        else if(operand == "/"){
            result = value1 / value2;
        }
        myEdittext.setText(String.valueOf(result));
    }
}
