package com.example.yabashot;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] Yabashet = {"Europe", "Asia", "America", "Africa"};
    String[] Madinot = new String[7];
    ListView lv;
    int check = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adp = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, Yabashet);
        lv.setAdapter(adp);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, Yabashet[position], Toast.LENGTH_SHORT).show();
        check = position;
        switch(position){
          case 0:
              Madinot = new String[]{"Germany", "Italy", "Poland", "Belgium", "Greece", "French", "Spain"};
             break;
        case 1:
           Madinot = new String[]{"Thailand","China","Japan","Israel","India","Vietnam","Hong Kong"};
           break;
        case 2:
          Madinot = new String[]{"Texas","Florida","Alabama","Woshington","New York","California","Alaska"};
          break;
        case 3:
          Madinot = new String[]{"Morocoo","Ethiopia","Sudan","Ghana","Uganda","Madagascar","Nigeria"};
         break;
               }
          }


    public void OC(View view) {
        Intent si = new Intent(this,Madinot.class);
        if(check== -1){
            Toast.makeText(this, "Choose a mainland", Toast.LENGTH_SHORT).show();
        }
        else {
            si.putExtra("n", Madinot);
            si.putExtra("nn", check);
            startActivity(si);
        }
    }
}
