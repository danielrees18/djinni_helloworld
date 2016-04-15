package com.mycompany.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private HelloWorld helloWorld;

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("helloworld");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.helloWorld = HelloWorld.create();
    }

    public void buttonWasPressed(View view) {
        String myString = helloWorld.getHelloWorld() + "\n";
        TextView t = (TextView) findViewById(R.id.helloWorldText);
        t.setText(myString + t.getText());
    }
}
