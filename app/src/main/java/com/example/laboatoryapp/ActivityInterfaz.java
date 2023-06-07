package com.example.laboatoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityInterfaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);

//        Fragment fragLayout= new fragment_linearlayout();
//        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.ContainerFrame,fragLayout).commit();

///////// se instancia fragmentos para poder generar la transicion  hacia el activity /////////
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = new fragment_linearlayout();//// instanciamos el primero fragmento LinearLayout en nuestro activity ///

        Fragment fragment2= new fragment_relativeLayout(); /// instanciamos el segundo fragmento que corresponde a RelativeLayout ///
        FragmentTransaction transaction = manager.beginTransaction();/// se instancia una transcicion para cada fragmento
        FragmentTransaction transaction2= manager.beginTransaction();/// transicion para el fragmento relativeLayout
        transaction.add(R.id.ContainerFrame,fragment);/// se define el frameLayout que recibira el fragmento fragment_linearlayouten este caso se llama containerFrame//
        transaction.commit();

        transaction2.add(R.id.ContainerFrame2,fragment2);/// se define el segundo framelayout que recibira el fragmento fragment_realativeLayout
        transaction2.commit();                        /// dichos framelayout estan creado en la parte xml del activityInterfaz

    }
}