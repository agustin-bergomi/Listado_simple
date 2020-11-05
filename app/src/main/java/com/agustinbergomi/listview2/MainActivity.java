package com.agustinbergomi.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {
    String[] inventario = {
            "Tornillo Parker",
            "Arandela Grower",
            "Tuerca castillo",
            "Bulon",
            "Tuerca hexagonal",
            "Tuerca autofrenante",
            "Varilla roscada",
            "Broca",
            "Zincado azul",
            "Zincado amarillo",
            "Pavonado"
    };

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lstView = getListView();
        lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lstView.setTextFilterEnabled(true);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked, inventario));
    }


    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "Seleccionaste: " + inventario[position], Toast.LENGTH_SHORT).show();
    }
}