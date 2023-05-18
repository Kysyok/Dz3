package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Bird> animals = new ArrayList<Bird>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_animal);
        BirdAdapter adapter = new BirdAdapter(this, animals);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Bird("Дрофа", "Крупная птица семейства дрофиных. Часто селится на пастбищах, пашнях и других используемых в сельском хозяйстве территориях.",
                R.drawable.dabao, "Численность средняя"));
        animals.add( new Bird("Сапсан", "Хищная птица из семейства соколиных, распространённая на всех континентах, кроме Антарктиды.",
                R.drawable.falco, "Численность средняя"));
        animals.add( new Bird("Сорока", "Птица семейства врановых из рода сорок.Сороки населяют всю Европу от Нордкапа в Скандинавии до южных оконечностей Испании и Греции.",
                R.drawable.sroka, "Численность большая"));
        animals.add( new Bird("Зяблик", "Певчая птица семейства вьюрковых. Размер — 14—18 см. Ярко выражен половой диморфизм.",
                R.drawable.chaffinch, "Численность большая"));
        animals.add( new Bird("Сизый голубь", "Широко распространённая птица семейства голубиных, родиной которой считаются Южная Европа, Юго-Западная Азия и Северная Африка. Ещё в глубокой древности эти птицы были приручены человеком, в результате были выведены так называемые домашние голуби.",
                R.drawable.papera, "Численность большая"));
    }
}