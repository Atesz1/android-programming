package com.example.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input;
    ListView history;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, plus, equal, minus, divide, multiplication, reset;

    float finalNumber = 0;
    float dividenumber = 0;
    float currentNumber = 0;
    float anothernumber = 0;
    String operation = "+";

    ArrayList<String> arrayhistory;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);

        history= findViewById(R.id.history);
        arrayhistory=new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayhistory);
        history.setAdapter(arrayAdapter);

        num0= findViewById(R.id.num0);
        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        num3= findViewById(R.id.num3);
        num4= findViewById(R.id.num4);
        num5= findViewById(R.id.num5);
        num6= findViewById(R.id.num6);
        num7= findViewById(R.id.num7);
        num8= findViewById(R.id.num8);
        num9= findViewById(R.id.num9);
        plus= findViewById(R.id.plus);
        equal= findViewById(R.id.equal);
        reset= findViewById(R.id.reset);
        minus= findViewById(R.id.minus);
        divide= findViewById(R.id.divide);
        multiplication=findViewById(R.id.multiplication);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        plus.setOnClickListener(this);
        equal.setOnClickListener(this);
        reset.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiplication.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        switch (v.getId() ){
            case R.id.num0:
                Log.d("attila","0");
                input.append("0");
                currentNumber = Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");

                break;

            case R.id.num1:
                input.append("1");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");

                break;

            case R.id.num2:
                input.append("2");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");

                break;

            case R.id.num3:
                input.append("3");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");

                break;

            case R.id.num4:
                input.append("4");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");

                break;

            case R.id.num5:
                input.append("5");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","number input=" + input.getText() +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");


                break;
            case R.id.num6:
                input.append("6");
                Log.d("attila","current number=" + currentNumber +"");
                //dividenumber = Float.parseFloat(input.getText().toString());
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber =  Float.parseFloat(input.getText().toString());
                break;

            case R.id.num7:
                input.append("7");
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                break;

            case R.id.num8:
                input.append("8");
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());
                break;

            case R.id.num9:
                input.append("9");
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber =  Float.parseFloat(input.getText().toString());
                //dividenumber = Float.parseFloat(input.getText().toString());

                break;

            case R.id.plus:
                operation = "+";
                anothernumber = currentNumber;
                finalNumber = finalNumber + currentNumber;

                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","operation +");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber=0;

                input.setText("");
                break;

            case R.id.equal:
                if (operation.equals("+")){
                    dividenumber = Float.parseFloat(input.getText().toString());
                    finalNumber = finalNumber + dividenumber;
                    arrayhistory.add("" + anothernumber + "+" +dividenumber);
                    arrayAdapter.notifyDataSetChanged();
                }
                else if (operation.equals("-")){
                    finalNumber= finalNumber - currentNumber;
                    arrayhistory.add("" + anothernumber + "-" +dividenumber);
                    arrayAdapter.notifyDataSetChanged();
            }
                else if (operation.equals(("/"))){
                    finalNumber= dividenumber / currentNumber;
                    arrayhistory.add("" + dividenumber + "/" +anothernumber);
                    arrayAdapter.notifyDataSetChanged();
            }
                else if (operation.equals(("*"))){
                    finalNumber= dividenumber * currentNumber;
                    arrayhistory.add("" + dividenumber + "*" +anothernumber);
                    arrayAdapter.notifyDataSetChanged();
            }

                operation = "=";

                currentNumber=0;

                //inputNumber += Integer.parseInt(input.getText().toString());
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                input.setText(finalNumber + "");
                break;

            case R.id.reset:
                currentNumber =0;
                finalNumber =0;
                Log.d("attila","inputnumber=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                input.setText("0");
                break;

            case R.id.minus:
                operation= "-";
                finalNumber = currentNumber - finalNumber;
                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","operation -");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber=0;

            case R.id.divide:
                operation= "/";
                finalNumber =  dividenumber / currentNumber;

                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","dividenumber=" + dividenumber +"");
                Log.d("attila","operation -");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber=0;

                input.setText("");
                break;

            case R.id.multiplication:
                operation= "*";
                finalNumber =  dividenumber * currentNumber;

                Log.d("attila","current number=" + currentNumber +"");
                Log.d("attila","finalnumber=" + finalNumber +"");
                Log.d("attila","dividenumber=" + dividenumber +"");
                Log.d("attila","operation -");
                Log.d("attila","óóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóóó");
                currentNumber=0;

                input.setText("");
                break;




        }
    }
}
