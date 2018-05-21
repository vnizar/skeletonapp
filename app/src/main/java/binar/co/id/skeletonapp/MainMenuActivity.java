package binar.co.id.skeletonapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {
    private String[] itemList = new String[]{"Laptop", "Kulkas", "Sepeda Motor", "Kursi", "Smartphone", "Meja", "Papan Tulis", "Bak Sampah"};
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeAdapter();
        initializeData();
    }

    private void initializeData() {
        // add loop to add data from itemList to arrayList, on each loop, call method addElement(element)

        // end here
        adapter.notifyDataSetChanged();
    }

    private void initializeAdapter() {
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        ListView listView = findViewById(R.id.list_products);
        listView.setAdapter(adapter);
    }

    private void addElement(String element){
        arrayList.add(element);
    }
}
