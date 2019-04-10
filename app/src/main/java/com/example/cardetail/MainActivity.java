package com.example.cardetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btndiesel;
    private EditText make, year, color, price, size;
    private TextView output;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make = findViewById(R.id.make);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        price = findViewById(R.id.price);
        size = findViewById(R.id.size);
        output = findViewById(R.id.output);
        btndiesel = findViewById(R.id.btndiesel);

        btndiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty()) {
                    i++;
                    String manuf = make.getText().toString();
                    float pr = Float.parseFloat(price.getText().toString());
                    float siz = Float.parseFloat(size.getText().toString());
                    output.append("This is vehicle No." + i + "\n" + "Manufacturer: " + manuf + " Current value: " +
                            pr + " Effective Engine Size: " + siz + "\n"+"\n");
                }
            }
        });
    }


            public boolean isEmpty() {
                if (TextUtils.isEmpty(make.getText().toString())) {
                    make.setError("Please enter manufacturer name");
                    make.requestFocus();
                    return true;
                } else if (TextUtils.isEmpty(year.getText().toString())) {
                    year.setError("Please enter year");
                    year.requestFocus();
                    return true;
                } else if (TextUtils.isEmpty(color.getText().toString())) {
                    color.setError("Please enter color");
                    color.requestFocus();
                    return true;
                } else if (TextUtils.isEmpty(price.getText().toString())) {
                    price.setError("Please enter price");
                    price.requestFocus();
                    return true;
                } else if (TextUtils.isEmpty(size.getText().toString())) {
                    size.setError("Please enter fuel capacity");
                    size.requestFocus();
                    return true;
                } else {
                    return false;
                }
            }
}

