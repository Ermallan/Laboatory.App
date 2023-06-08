package com.example.laboatoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ActivityCardView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        Fragment fragmentCard= new fragmentCardview();
        FragmentManager managerCard= getSupportFragmentManager();
        FragmentTransaction transicion= managerCard.beginTransaction();
        transicion.add(R.id.containerCard,fragmentCard);
        transicion.commit();


    }
}