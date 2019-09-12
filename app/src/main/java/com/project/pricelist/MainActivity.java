package com.project.pricelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> name = new ArrayList<>(Arrays.asList("Goat", "Yam", "Rice", "Chicken", "Puff puff", "Sausage roll", "Egg", "Kunu", "Water", "Zobo"));
    private ArrayList<String> price = new ArrayList<>(Arrays.asList("100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"));
    private ArrayList<Integer> image = new ArrayList<>(Arrays.asList(R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt, R.drawable.yoghurt));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.price_recyclerview);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        
        ListAdapter listAdapter = new ListAdapter(this, name, price, image);
        recyclerView.setAdapter(listAdapter);
        
        

    }
}
