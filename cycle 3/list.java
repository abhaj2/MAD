package com.example.sjcet.list2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String msg=getIntent().getStringExtra("mykey");
        lv=(ListView)findViewById(R.id.lv);
        String[] courses={"MCA","MBA","BBA","BCA"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courses);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);//implement the method by alt+enter
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname=lv.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();

    }
}
