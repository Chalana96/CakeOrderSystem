package com.example.checkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayDeliveryDetails extends AppCompatActivity {

      /*EditText etName;
    EditText mtAddress;
    EditText etContactNo;
    EditText etEmail;
    EditText mtMsg;
    Time etTime;
    CalendarView cvDate;
    Button btnSubmit;*/


    private TextView details;
    private Button SuccessButton;
    private String name,address,contactNo,email,message,time;
   private Button cancel,edit,makepayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_delivery_details);

        makepayment = findViewById(R.id.btn_MakePayment);
      cancel = findViewById(R.id.btn_Details_cancel);
        details = findViewById(R.id.tvDisplay);

        name = getIntent().getStringExtra("name");
        address = getIntent().getStringExtra("address");
        contactNo = getIntent().getStringExtra("Contact No");
        email = getIntent().getStringExtra("Email");
        message =getIntent().getStringExtra("Message");
        time =getIntent().getStringExtra("Time");

        details.setText("\n\n\nFull Name  :" + name + "\n\n\nDelivery Address :" + address+ "\n\n\nContact No  :" + contactNo+ "\n\n\nEmail  :"+email+ "\n\n\nMessage  :" +message+ "\n\n\nDelivery Time :"+time);

        makepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),FinalPage.class);


                startActivity(intent);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),DeliveryForm.class);

                startActivity(intent2);
            }
        });





            }
        });

    }
}
