package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ed;

    float firstValue,secondValue;
    boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText)findViewById(R.id.edt);
    }
    public void enterNum(View view){
        switch(view.getId()){
            case R.id.b1:
                ed.setText(ed.getText()+"1");
                break;
            case R.id.b2:
                ed.setText(ed.getText()+"2");
                break;
            case R.id.b3:
                ed.setText(ed.getText()+"3");
                break;
            case R.id.b5:
                ed.setText(ed.getText()+"4");
                break;
            case R.id.b6:
                ed.setText(ed.getText()+"5");
                break;
            case R.id.b7:
                ed.setText(ed.getText()+"6");
                break;
            case R.id.b9:
                ed.setText(ed.getText()+"7");
                break;
            case R.id.b10:
                ed.setText(ed.getText()+"8");
                break;
            case R.id.b11:
                ed.setText(ed.getText()+"9");
                break;
            case R.id.b14:
                ed.setText(ed.getText()+"0");
                break;
            case R.id.b15:
                ed.setText(ed.getText()+".");
                break;

        }
    }
    public void performOperation(View view){
        switch(view.getId()){
            case R.id.b4:
                if(ed==null){
                    ed.setText("");
                }
                else{
                    firstValue=Float.parseFloat(ed.getText()+"");
                    addition=true;
                    ed.setText(null);
                }
                break;
            case R.id.b8:
                if(ed==null){
                    ed.setText("");
                }
                else{
                    firstValue=Float.parseFloat(ed.getText()+"");
                    subtraction=true;
                    ed.setText(null);
                }
                break;
            case R.id.b12:
                if(ed==null){
                    ed.setText("");
                }
                else{
                    firstValue=Float.parseFloat(ed.getText()+"");
                    multiplication=true;
                    ed.setText(null);
                }
                break;
            case R.id.b16:
                if(ed==null){
                    ed.setText("");
                }
                else{
                    firstValue=Float.parseFloat(ed.getText()+"");
                    division=true;
                    ed.setText(null);
                }
                break;
        }
    }
    public void clearText(View view){
        ed.setText("");
    }
    public void getAnswer(View view){
        secondValue=Float.parseFloat(ed.getText()+"");
        if(addition==true){
            ed.setText(firstValue + secondValue+"");
            addition=false;
        }
        if(subtraction==true){
            ed.setText(firstValue - secondValue+"");
            subtraction=false;
        }
        if(multiplication==true){
            ed.setText(firstValue * secondValue +"");
            multiplication=false;
        }
        if(division==true){
            ed.setText(firstValue / secondValue+"");
            division=false;
        }
    }
}