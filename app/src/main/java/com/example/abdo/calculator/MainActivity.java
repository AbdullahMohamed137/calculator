package com.example.abdo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        final TextView t=findViewById( R.id.Text_View );
        final EditText x=findViewById( R.id.Edit_Text1 );
        final EditText y=findViewById( R.id.Edit_Text2 );
        final Button b=findViewById( R.id.Button1 );
        final Button p=findViewById( R.id.Button2 );

        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h=x.getText().toString();
                String j=y.getText().toString();
                int g=textToNumber( h );
                int k=textToNumber( j );
                t.setText( numberToText( g+k ) );
            }
        } );
        p.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h=x.getText().toString();
                String j=y.getText().toString();
                int g=textToNumber(h );
                int k=textToNumber( j );
                t.setText( numberToText( g-k ) );
            }
        } );

    }
    private String numberToText(int number){
        return String.valueOf(number);
    }

    private int textToNumber(String text){
        return Integer.valueOf(text);
    }
}
