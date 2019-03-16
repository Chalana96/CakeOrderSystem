package com.example.checkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DeliveryForm extends AppCompatActivity {


    private EditText name, address, email, contactNo, message,time;
    private Button submit;



    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_form);

        name = findViewById(R.id.etName);
        address = findViewById(R.id.mtAddress);
        contactNo = findViewById(R.id.etContactNum);
        email = findViewById(R.id.mtEmail);
        message = findViewById(R.id.etMsg);
        time = findViewById(R.id.etDeliveryTime);
        submit = findViewById(R.id.btnSubmit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeliveryForm.this,DisplayDeliveryDetails.class);


                intent.putExtra("Full Name        :", name.getText().toString());
                intent.putExtra("Delivery Address :", address.getText().toString());
                intent.putExtra("Contact No       :", contactNo.getText().toString());
                intent.putExtra("Email            :", email.getText().toString());
                intent.putExtra("Message          :", message.getText().toString());
                intent.putExtra("Delivery Time    :",time.getText().toString());

                startActivity(intent);
            }
        });


    }

}

