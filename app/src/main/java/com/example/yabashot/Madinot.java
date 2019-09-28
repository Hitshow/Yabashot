package com.example.yabashot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Madinot extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView city;
    TextView pop;
    ListView lv1;
    String [] Capital = new String[7];
    int x1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madinot);
        lv1 =(ListView) findViewById(R.id.lv1);
        city = (TextView) findViewById(R.id.city);
        pop= (TextView)findViewById(R.id.pop);
        Intent gi = getIntent();
        Capital=gi.getStringArrayExtra("n");
        x1 =gi.getIntExtra("nn",0);
       ArrayAdapter <String> adp2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Capital);
        lv1.setAdapter(adp2);
        lv1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv1.setOnItemClickListener(this);
    }








        public void Oc2 (View view){
            finish();
        }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(x1==0){
            switch (position){
                case 0:
                    pop.setText("Population: 82.8M");
                    city.setText("Capital City: Berlin");
                    break;
                case 1:
                    pop.setText("Population: 61M");
                    city.setText("Capital City: Rome");
                    break;
                case 2:
                    pop.setText("Population: 38.43M");
                    city.setText("Capital City: Warsaw");
                    break;
                case 3:
                    pop.setText("Population: 11.35M");
                    city.setText("Capital City: Brussels");
                    break;
                case 4:
                    pop.setText("Population: 10.77M");
                    city.setText("Capital City: Athens");
                    break;
                case 5:
                    pop.setText("Population: 67M");
                    city.setText("Capital City: Paris");
                    break;
                case 6:
                    pop.setText("Population: 46.72M");
                    city.setText("Capital City: Madrid");
                    break;
            }
        }
        if (x1==1){
            switch (position){
                case 0:
                    pop.setText("Population: 69M");
                    city.setText("Capital City: Bangkok");
                    break;
                case 1:
                    pop.setText("Population: 1.386B");
                    city.setText("Capital City: Beijing");
                    break;
                case 2:
                    pop.setText("Population: 126.8M");
                    city.setText("Capital City: Tokyo");
                    break;
                case 3:
                    pop.setText("Population: 8.7M");
                    city.setText("Capital City: Jerusalem");
                    break;
                case 4:
                    pop.setText("Population: 1.339B");
                    city.setText("Capital City: New Delhi");
                    break;
                case 5:
                    pop.setText("Population: 95.54M");
                    city.setText("Capital City: Hanoi");
                    break;
                case 6:
                    pop.setText("Population: 7.739M");
                    city.setText("Capital City: Victoria");
                    break;
            }
        }
        if(x1==2){
            switch (position){
                case 0:
                    pop.setText("Population: 28.7M");
                    city.setText("Capital City: Austin");
                    break;
                case 1:
                    pop.setText("Population: 21.3M");
                    city.setText("Capital City: Tallahassee");
                    break;
                case 2:
                    pop.setText("Population: 4.888M");
                    city.setText("Capital City: Montagomery");
                    break;
                case 3:
                    pop.setText("Population: 7.536M");
                    city.setText("Capital City: Olympia");
                    break;
                case 4:
                    pop.setText("Population: 8.623M");
                    city.setText("Capital City: Albany");
                    break;
                case 5:
                    pop.setText("Population: 39.56M");
                    city.setText("Capital City: Sacramanto");
                    break;
                case 6:
                    pop.setText("Population: 737,438");
                    city.setText("Capital City: Jono");
                    break;
            }
        }
        if(x1==3){
            switch (position){
                case 0:
                    pop.setText("Population: 35.74M");
                    city.setText("Capital City: Rabat");
                    break;
                case 1:
                    pop.setText("Population: 105M");
                    city.setText("Capital City: Addis Ababa");
                    break;
                case 2:
                    pop.setText("Population: 40.53M");
                    city.setText("Capital City: Khartoum");
                    break;
                case 3:
                    pop.setText("Population: Accra");
                    city.setText("Capital City: 28.83M");
                    break;
                case 4:
                    pop.setText("Population: 42.86M");
                    city.setText("Capital City: Campala");
                    break;
                case 5:
                    pop.setText("Population: 25.57M");
                    city.setText("Capital City: Antanarivo");
                    break;
                case 6:
                    pop.setText("Population: 190.09M");
                    city.setText("Capital City: Abuja");
                    break;
            }
        }
    }
}