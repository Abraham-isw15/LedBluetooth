package com.monsh.demoleddroidcon;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by monsh on 01/03/2017.
 */

public class GetData extends AppCompatActivity {
    Button btnTest;
    TextView txtArduino;

    BluetoothSocket btSocket = null;

    String address = null;
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent newint = getIntent();
        address = newint.getStringExtra(DeviceList.EXTRA_ADDRESS); //receive the address of the bluetooth device

        txtArduino = (TextView) findViewById(R.id.textView4);
        btnTest = (Button) findViewById(R.id.button6);
        setContentView(R.layout.activity_get_data);

        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

}
