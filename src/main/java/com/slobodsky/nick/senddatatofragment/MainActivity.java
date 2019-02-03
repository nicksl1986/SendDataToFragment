package com.slobodsky.nick.senddatatofragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BlankFragment blanco = BlankFragment.newInstance("Number ", 1);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, blanco).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
