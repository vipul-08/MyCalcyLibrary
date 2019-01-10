package io.github.vipul_08.mycalcyexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mobicule.mycalcy.Calculator;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText firstNum , secondNum;
    Button plus , minus , product , divide , modulus ;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        product = findViewById(R.id.product);
        divide = findViewById(R.id.divide);
        modulus = findViewById(R.id.modulus);

        resultText = findViewById(R.id.resText);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(firstNum.getText()) || TextUtils.isEmpty(secondNum.getText())) {
                    Toast.makeText(MainActivity.this,"Enter the operands!!" , Toast.LENGTH_LONG).show();
                }
                else {
                    resultText.setText("Result = "+
                            Calculator.add(
                                    Integer.parseInt(firstNum.getText().toString()),
                                    Integer.parseInt(secondNum.getText().toString())
                            )
                    );
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(firstNum.getText()) || TextUtils.isEmpty(secondNum.getText())) {
                    Toast.makeText(MainActivity.this,"Enter the operands!!" , Toast.LENGTH_LONG).show();
                }
                else {
                    resultText.setText("Result = "+
                            Calculator.subtract(
                                    Integer.parseInt(firstNum.getText().toString()),
                                    Integer.parseInt(secondNum.getText().toString())
                            )
                    );
                }
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(firstNum.getText()) || TextUtils.isEmpty(secondNum.getText())) {
                    Toast.makeText(MainActivity.this,"Enter the operands!!" , Toast.LENGTH_LONG).show();
                }
                else {
                    resultText.setText("Result = "+
                            Calculator.multiply(
                                    Integer.parseInt(firstNum.getText().toString()),
                                    Integer.parseInt(secondNum.getText().toString())
                            )
                    );
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(firstNum.getText()) || TextUtils.isEmpty(secondNum.getText())) {
                    Toast.makeText(MainActivity.this,"Enter the operands!!" , Toast.LENGTH_LONG).show();
                }
                else {
                    resultText.setText("Result = "+
                            Calculator.divide(
                                    Integer.parseInt(firstNum.getText().toString()),
                                    Integer.parseInt(secondNum.getText().toString())
                            )
                    );
                }
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(firstNum.getText()) || TextUtils.isEmpty(secondNum.getText())) {
                    Toast.makeText(MainActivity.this,"Enter the operands!!" , Toast.LENGTH_LONG).show();
                }
                else {
                    resultText.setText("Result = "+
                            Calculator.modulus(
                                    Integer.parseInt(firstNum.getText().toString()),
                                    Integer.parseInt(secondNum.getText().toString())
                            )
                    );
                }
            }
        });

    }
}
