package com.directory.sajid.ifb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.width;
import static com.directory.sajid.ifb.R.attr.height;

public class DetailsActivity extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;
    ListView listView;
    ArrayList<String> selectedItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView = (TextView) findViewById(R.id.textView1);
        Bundle bundle = getIntent().getExtras();
        textView.setText(bundle.getString("listItem"));


        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        listView = (ListView) findViewById(R.id.list);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items = {"Load capacity" , "Wash temperature" , "Energy Consumption" , "Energy efficiency" , "Water consumption" , "Wash Quality rating" , "Rinse efficiency" , "Spin Efficiency" , "Cold Intake" , "Hot water intake"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_multiple_choice , items  );
        listView.setAdapter(adapter);

        //item click code
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(DetailsActivity.this, "Hello", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
