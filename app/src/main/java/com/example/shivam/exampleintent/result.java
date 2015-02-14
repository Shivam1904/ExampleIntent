package com.example.shivam.exampleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends ActionBarActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        String usr1,pass1;
        Intent in=getIntent();
        usr1=in.getStringExtra("usrname");
        pass1=in.getStringExtra("passwrd");

        TextView tx1,tx2;
        tx1=(TextView)findViewById(R.id.username);
        tx2=(TextView)findViewById(R.id.password);

        tx1.setText(usr1);
        tx2.setText(pass1);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(result.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
